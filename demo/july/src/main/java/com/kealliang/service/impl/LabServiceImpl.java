package com.kealliang.service.impl;

import com.kealliang.service.LabService;
import com.kealliang.vo.DictVO;
import com.meicloud.sahara.orm.service.impl.MybatisServiceImpl;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lsr
 * @ClassName LabServiceImpl
 * @Date 2020-02-04
 * @Desc
 * @Vertion 1.0
 */
@Component
public class LabServiceImpl extends MybatisServiceImpl implements LabService {

    @Override
    public List<DictVO> str() {
        List<DictVO> ret = this.findByStatement("findDictByCode", "OPEN_WAY");
        return ret;
    }
}
