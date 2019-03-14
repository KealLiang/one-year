package com.kealliang.service.impl;

import com.kealliang.entity.SysUrl;
import com.kealliang.service.PropagationService2;
import com.meicloud.sahara.core.exception.HrmsException;
import com.meicloud.sahara.orm.EntityStatement;
import com.meicloud.sahara.orm.service.IEntityStatement;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lsr
 * @ClassName PropagationService2Impl
 * @Date 2019-03-14
 * @Desc
 * @Vertion 1.0
 */
@Service
public class PropagationService2Impl implements PropagationService2 {

    @EntityStatement
    private IEntityStatement<SysUrl> urlES;


    @Override
    public void aa() {

    }

    @Transactional(propagation = Propagation.NESTED)
    @Override
    public void bb() {
        Integer urlId = 100021;

        SysUrl url = urlES.find(urlId);

        if (url == null) {
            return;
        }

        // 更新数据
        url.setUrlName("PropagationServiceImpl2.bb()");
        urlES.update(url);

        // 异常
        int i = 3;
        if (30 / i == 10) {
            throw new HrmsException("抛出了异常！");
        }
    }
}
