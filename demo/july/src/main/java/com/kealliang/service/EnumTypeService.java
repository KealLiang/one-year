package com.kealliang.service;

import com.kealliang.entity.SysDictItem;

import java.util.List;

/**
 * @author lsr
 * @ClassName EnumTypeService
 * @Date 2020-02-04
 * @Desc
 * @Vertion 1.0
 */
public interface EnumTypeService {
    List<SysDictItem> getDictItemsByCode(String code);
}
