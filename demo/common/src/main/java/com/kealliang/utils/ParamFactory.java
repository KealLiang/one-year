package com.kealliang.utils;

import com.meicloud.sahara.orm.vo.ParamMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lsr
 * @Date 2018-08-03
 * @Desc 参数工具类
 */
public class ParamFactory {

    private static ParamMap pm = new ParamMap();

    /**
     * 获取新的paramMap
     * @return
     */
    public static ParamMap newParam(){
        return new ParamMap();
    }

    /**
     * 获取新的Map
     * @return
     */
    public static Map<String, Object> newMap(){
        return new HashMap<>(16);
    }
}
