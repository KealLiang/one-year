package com.kealliang.utils;

/**
 * @author lsr
 * @ClassName SqlUtil
 * @Date 2019-05-03
 * @Desc sql工具
 * @Vertion 1.0
 */
public class SqlUtil {
    /**
     * 原始sql
     */
    String inputSql = "";

    /**
     * 参数
     */
    String parameterStr = "20170217(String)";

    /**
     * 将mybatis打印的sql和参数整理为可执行sql
     * @return
     */
    public String sqlOut () {
        String exportSql = inputSql.trim(); //导出sql
        String [] parameters = parameterStr.split(",");
        for (String parameter : parameters) {
            if (parameter.contains("String")) {
                exportSql = exportSql.replaceFirst("\\?", "'"+parameter.replace("(String)", "").trim()+"'");
            } else if (parameter.contains("Date")) {
                exportSql = exportSql.replaceFirst("\\?", parameter.replace("(Date)", "").trim());
            } else if (parameter.contains("Long")) {
                exportSql = exportSql.replaceFirst("\\?", parameter.replace("(Long)", "").trim());
            } else if (parameter.contains("Integer")) {
                exportSql = exportSql.replaceFirst("\\?", parameter.replace("(Integer)", "").trim());
            } else if (parameter.contains("Timestamp")) {
                exportSql = exportSql.replaceFirst("\\?", "to_date('"+parameter.replace("(Timestamp)", "").substring(0, 11).trim()+"','yyyy-MM-dd')");
            }
        }
        return exportSql;
    }

    public static void main(String[] args) {
        SqlUtil sqlUtil = new SqlUtil();
        System.out.println(sqlUtil.sqlOut());
    }
}
