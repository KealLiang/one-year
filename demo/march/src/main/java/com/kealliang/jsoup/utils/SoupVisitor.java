package com.kealliang.jsoup.utils;

import org.jsoup.nodes.Node;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lsr
 * @ClassName SoupVisitor
 * @Date 2019-03-15
 * @Desc soup工具类
 * @Vertion 1.0
 */
public class SoupVisitor {

    /** 
     * 爬出node中的url
     * @author lsr
     * @description head
     * @Date 16:26 2019/3/15
     * @Param [node, urls]
     * @return void
     */
    public void head(Node node, Set<String> urls) {
        String nodeStr = node.toString();
        String regex = "\"(http.*?)\"";
        // 正则的使用：两个类 Pattern 和 Matcher
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(nodeStr);
        if (!matcher.find()) {
            return;
        }
        // 捕获组是通过从左至右计算其开括号来编号
        // 例如 ((A)(B(C))) 中有4个这样的组
//        for (int i=0; i<matcher.groupCount(); i++) {
//            urls.add(matcher.group(i));
//        }
        urls.add(matcher.group(1)); // $1
    }

    public void tail(Node node, Set<String> urls) {

    }
}
