package com.kealliang.service;

/**
 * @author lsr
 * @ClassName WriteSqlService
 * @Date 2019-03-06
 * @Desc 将系统中的sql写到文件中
 * @Vertion 1.0
 */
public interface WriteSqlService {
    
    /** 
     * 将mapper中的sql写到文件中
     * @author lsr
     * @description writeSql
     * @Date 15:27 2019/3/6
     * @Param [key]
     * @return java.lang.String
     */
    String writeSql(String key);
}
