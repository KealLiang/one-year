package com.kealliang.constant;

import com.kealliang.entity.SysDictItem;
import com.kealliang.service.EnumTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.EnumSet;
import java.util.Iterator;
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

        private void initEnumType() {
            List<SysDictItem> items = enumTypeService.getDictItemsByCode("EMP_EMPLOYEE_STATUS");
            if (!CollectionUtils.isEmpty(items)) {
                EnumSet<EnumType> enumTypes = EnumSet.allOf(EnumType.class);
                if(items.size() != enumTypes.size()) {
                    throw new IllegalArgumentException("初始化异常：字典的内容与枚举类不匹配！");
                }
                int i = 0;
                Iterator<EnumType> it = enumTypes.iterator();
                while(it.hasNext()) {
                    EnumType enumType = it.next();
                    enumType.setCode(items.get(i).getDictItemValue());
                    enumType.setName(items.get(i).getDictItemName());
                    i++;
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
            initEnumType();
        }

    }
}
