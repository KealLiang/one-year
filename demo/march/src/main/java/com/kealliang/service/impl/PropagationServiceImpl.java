package com.kealliang.service.impl;

import com.kealliang.entity.SysUrl;
import com.kealliang.service.PropagationService;
import com.kealliang.service.PropagationService2;
import com.meicloud.sahara.core.exception.HrmsException;
import com.meicloud.sahara.orm.EntityStatement;
import com.meicloud.sahara.orm.service.IEntityStatement;
import com.meicloud.sahara.orm.service.impl.MybatisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lsr
 * @ClassName PropagationServiceImpl
 * @Date 2019-03-14
 * @Desc
 * @Vertion 1.0
 */
@Service
public class PropagationServiceImpl extends MybatisServiceImpl implements PropagationService {

    @EntityStatement
    private IEntityStatement<SysUrl> urlES;

    @Autowired
    private PropagationService2 propagationService2;

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void aa() {
        Integer urlId = 100023;

        updateUrl(urlId, "PropagationServiceImpl.aa()");

        // bb的传播行为设置为NESTED
        // 1、未处理uncheck异常时，bb抛出异常，aa与bb都回滚
//        propagationService2.bb();
        try {
            // 2、处理了uncheck异常后，bb抛出异常，bb回滚，aa不回滚
            propagationService2.bb();
//            bb(); // 这里的bb是什么传播行为无关紧要，因为相当于private方法
        } catch (Exception e) {
            System.err.println("异常了，哦哦");
        }
    }

    // 这里bb()设为NESTED，并让aa方法调用，没有卵用
    // 因为aa和bb位于同一个代理对象中（*注意*，此时相当于直接调用对象中的private方法）
    @Transactional(propagation = Propagation.NESTED, rollbackFor = RuntimeException.class)
    @Override
    public void bb() {
        Integer urlId = 100021;

        updateUrl(urlId, "PropagationServiceImpl.bb()");

        // 异常
        int i = 3;
        if (30 / i == 10) {
            throw new HrmsException("抛出了异常！");
        }
    }


    private boolean updateUrl(Integer urlId, String s) {
        SysUrl url = urlES.find(urlId);

        if (url == null) {
            return true;
        }

        url.setUrlName(s);
        urlES.update(url);
        return false;
    }

}
