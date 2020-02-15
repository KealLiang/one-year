package com.kealliang.constant;

import com.kealliang.entity.SysDictItem;
import com.kealliang.service.EnumTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.EnumSet;
import java.util.List;

/**
 * @author lsr
 * @ClassName EnumType
 * @Date 2020-02-04
 * @Desc 向枚举对象中注入bean
 * @Vertion 1.0
 */
public enum EnumType {
    MORNING,
    NOON,
    AFTERNOON
    ;

    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    EnumType(){}

    EnumType(String name, String code) {
        this.name = name;
        this.code = code;
    }


    @Component
    public static class EnumTypeInjector {
        @Autowired
        private EnumTypeService enumTypeService;

        private void initEnumType(EnumType enumType) {
            List<SysDictItem> items = enumTypeService.getDictItemsByCode("SYS_LANGUAGE");
            if (!CollectionUtils.isEmpty(items)) {
                for (SysDictItem item : items) {
                    enumType.setCode(item.getDictItemValue());
                    enumType.setName(item.getDictItemName());
                }
            }
        }

    /*    @Autowired
        private LabService labService;

        private void initEnumType(EnumType enumType) {
            List<DictVO> ret = labService.str();
            if (!CollectionUtils.isEmpty(ret)) {
                for (DictVO dictVO : ret) {
                    enumType.setCode(dictVO.getItemValue());
                    enumType.setName(dictVO.getItemName());
                }
            }
        }*/

        @PostConstruct
        public void postConstruct() {
            System.err.println("EnumTypeInjector 初始化");
            for (EnumType enumType : EnumSet.allOf(EnumType.class)) {
                initEnumType(enumType);
            }

        }

    }
}
