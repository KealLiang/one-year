package com.kealliang.service.impl;

import com.kealliang.entity.PosJobTitle;
import com.kealliang.service.LockDemoService;
import com.kealliang.utils.CodeUtils;
import com.meicloud.sahara.orm.EntityStatement;
import com.meicloud.sahara.orm.service.IEntityStatement;
import com.meicloud.sahara.orm.vo.Order;
import com.meicloud.sahara.orm.vo.ParamMap;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lsr
 * @ClassName LockDemoServiceImpl
 * @Date 2019-01-23
 * @Desc
 * @Vertion 1.0
 */
@Service
public class LockDemoServiceImpl implements LockDemoService {

    @EntityStatement
    private IEntityStatement<PosJobTitle> titleES;

    @Transactional
    @Override
    public void forwardUpdate() {
        List<PosJobTitle> titles = findJobTitleByRange(200, 500, Order.ASC("jobTitleId"));
        for (PosJobTitle title : titles) {
            title.setDescription("顺序更新的测试数据");
            titleES.update(title);
        }
    }

    @Transactional
    @Override
    public void backwardUpdate() {
        List<PosJobTitle> titles = findJobTitleByRange(250, 550, Order.DESC("jobTitleId"));
        for (PosJobTitle title : titles) {
            title.setDescription("倒序更新的测试数据");
            titleES.update(title);
        }
    }


    @Transactional
    @Override
    public void gapTest(int id) {
        titleES.delete(id); // 删除
        PosJobTitle title = PosJobTitle.PosJobTitleBuilder.aPosJobTitle()
                .withJobTitleId(id)
                .withJobTitleName("testGap" + id)
                .withJobTitleCode(CodeUtils.generateCode())
                .withDescription("这是一条测试数据" + id * 10)
                .build();
        titleES.create(title); // 插入
    }

    @Transactional
    @Override
    public void gapTest2() {
        List<PosJobTitle> jobTitles = titleES.findBy("jobTitleName", "testGap2019");
        ParamMap pm = new ParamMap();
        pm.eq("jobTitleName", "testGap2019");
        titleES.deleteBy(pm);
        titleES.batchCreate(jobTitles);
    }


    @Override
    public void initData() {
        List<PosJobTitle> titles = new ArrayList<>(400);
        for (int i=0; i<2000; i++) {
            PosJobTitle title = PosJobTitle.PosJobTitleBuilder.aPosJobTitle()
                    .withJobTitleName("test" + i)
                    .withJobTitleCode(CodeUtils.generateCode())
                    .withDescription("这是一条测试数据" + i * 10)
                    .build();
            titles.add(title);
        }
        titleES.batchCreate(titles);
    }


    private List<PosJobTitle> findJobTitleByRange(int lower, int upper, Order order) {
        ParamMap pm = new ParamMap();
        pm.lt("jobTitleId", upper);
        pm.gt("jobTitleId", lower);
        return titleES.findBy(pm, order);
    }


    @Transactional
    @Override
    public void impossible() {
        ParamMap pm = new ParamMap();
        pm.eq("jobTitleCode", "15b5ad4c-6800-44d1-b123-d4061ae063e0");
        pm.eq("jobTitleName", "test1999");
        pm.eq("description", "这是一条测试数据19990");
        titleES.deleteBy(pm);
    }
}
