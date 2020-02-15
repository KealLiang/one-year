package com.kealliang.service.impl;

import com.kealliang.entity.SysDict;
import com.kealliang.entity.SysDictItem;
import com.kealliang.service.EnumTypeService;
import com.meicloud.sahara.core.exception.TipsException;
import com.meicloud.sahara.orm.EntityStatement;
import com.meicloud.sahara.orm.service.IEntityStatement;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lsr
 * @ClassName EnumTypeServiceImpl
 * @Date 2020-02-04
 * @Desc
 * @Vertion 1.0
 */
@Service
public class EnumTypeServiceImpl implements EnumTypeService {

    @EntityStatement
    private IEntityStatement<SysDict> dictES;

    @EntityStatement
    private IEntityStatement<SysDictItem> dictItemES;

    @Override
    public List<SysDictItem> getDictItemsByCode(String code) {
        SysDict dict = dictES.findFirstBy("dictCode", code);
        if (dict == null) {
            throw new TipsException("code"+code+"不存在！");
        }
        return dictItemES.findBy("dictId", dict.getDictId());
    }
}
