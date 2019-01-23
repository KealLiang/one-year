package com.kealliang.utils;

import java.util.UUID;

/**
 * @author lsr
 * @ClassName CodeUtils
 * @Date 2019-01-18
 * @Desc code工具
 * @Vertion 1.0
 */
public class CodeUtils {

    public static String generateCode(){
        return UUID.randomUUID().toString();
    }
}
