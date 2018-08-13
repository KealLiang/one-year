package com.kealliang.february.service.impl;

import com.kealliang.february.service.DemoService;
import com.kealliang.org.entity.Haha;
import com.kealliang.org.entity.OrgArea;
import com.kealliang.org.entity.OrgUnit;
import com.kealliang.utils.ParamFactory;
import com.meicloud.sahara.core.vo.PagedResult;
import com.meicloud.sahara.orm.EntityStatement;
import com.meicloud.sahara.orm.service.IEntityStatement;
import com.meicloud.sahara.orm.service.impl.MybatisServiceImpl;
import com.meicloud.sahara.orm.vo.Order;
import com.meicloud.sahara.orm.vo.ParamMap;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author lsr
 * @Date 2018-08-03
 * @Desc 演示服务类
 */
@Service
public class DemoServiceImpl extends MybatisServiceImpl implements DemoService {

    @EntityStatement
    private IEntityStatement<OrgUnit> orgUnitES;
    @EntityStatement
    private IEntityStatement<OrgArea> orgAreaES;
    @EntityStatement
    private IEntityStatement<Haha> hahaES;

    @Override
    public void printCurrentThread() {
        System.out.println("当前访问的线程为 -> " + Thread.currentThread().getName());
    }

    @Override
    public Date printNowDate(){
        return this.findFirstByStatement("getCurrentTime", null);
    }

    @Transactional
    @Override
    public void concurrentUpdate() {
        ParamMap pm = ParamFactory.newParam();
        pm.eq("orgBelongLevel", "200");
        List<OrgUnit> ou = orgUnitES.findBy(pm, Order.ASC("orgUnitCode"));
        for (OrgUnit orgUnit : ou) {
            orgUnit.setStatus("1");
            orgUnitES.update(orgUnit);
        }
    }

    @Transactional
    @Override
    public void concurrentUpdate2() {
        ParamMap pm = ParamFactory.newParam();
        pm.eq("orgBelongLevel", "200");
        List<OrgUnit> ou = orgUnitES.findBy(pm, Order.DESC("orgUnitCode"));
        for (OrgUnit orgUnit : ou) {
            orgUnit.setStatus("0");
            orgUnitES.update(orgUnit);
        }
    }

    @Transactional
    public void concurrentUpdate(int index, int size){
        ParamMap pm = ParamFactory.newParam();
        pm.eq("orgTier", "6");
        PagedResult<OrgUnit> result = orgUnitES.pagedQuery(pm, index, size, Order.ASC("createDate"));
        for (OrgUnit orgUnit : result.getData()) {
            orgUnit.setStatus("0");
            orgUnitES.update(orgUnit);
        }
    }

    @Transactional
    @Override
    public void concurrentExperiment() {
        ParamMap pm = ParamFactory.newParam();
        pm.eq("areaName", "黑龙江");
        OrgArea oa = orgAreaES.findFirstBy(pm);
        System.out.println(oa.getAreaCode());
        oa.setAreaCode("HL01");
        orgAreaES.update(oa);

        String id = "565b7c83283511e8b23f005056a950cd";
        OrgArea oa2 = orgAreaES.find(id);
        System.out.println(oa2.getAreaCode());
    }

    @Transactional
    @Override
    public void concurrentExperitment2() {
        String id = "565b7c83283511e8b23f005056a950cd";
        OrgArea oa = orgAreaES.find(id);
        oa.setAreaCode("HL02");
        orgAreaES.update(oa);

        try {
            TimeUnit.SECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(oa.getAreaCode());
    }

    @Transactional
    @Override
    public void gapLock() {
        Haha haha = new Haha();
        haha.setId(20);
        haha.setA("gapLock20");
        haha.setB(20);

        Map<String, Object> map = ParamFactory.newMap();
        map.put("b", 20);
        this.deleteByStatement("deleteFromHaha", map);
        hahaES.create(haha);
    }

    @Transactional
    @Override
    public void gapLock2() {
        Haha haha = new Haha();
        haha.setId(25);
        haha.setA("gapLock25");
        haha.setB(25);

        Haha d = new Haha();
        haha.setB(25);
        hahaES.delete(d);
        hahaES.create(haha);
    }

}
