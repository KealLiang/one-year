package com.kealliang.jsoup;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lsr
 * @ClassName Jsoups
 * @Date 2019-03-12
 * @Desc jsoup工具
 * @Vertion 1.0
 */
public class Jsoups {

    private static Logger LOG = LoggerFactory.getLogger(Jsoups.class);

    /** url缓存 */
    private static final Map<String, String> urls = new HashMap<>();

    /** 
     * 获取url对应的document
     * @author lsr
     * @description doc
     * @Date 10:23 2019/3/13
     * @Param [url, cookies]
     * @return org.jsoup.nodes.Document
     */
    public static Document doc(String url, Map<String, String> cookies) {
        if (cookies == null) {
            cookies = new HashMap<>();
        }
        Connection connect = Jsoup.connect(url).cookies(cookies);
        Document doc;
        try {
            doc = connect.get();
        } catch (IOException e) {
            LOG.error("获取[{}]连接异常", url, e);
            return null;
        }
        return doc;
    }

    public Map<String, String> collectUrls (String url) {
        Document doc = doc(url, null);
        Element body = doc.body();
        System.out.println(body);
        return urls;
    }


    public static void main(String[] args) throws IOException {
        String url = "https://www.baidu.com";
        Document document = doc(url, null);
        System.out.println(document.title());

        Element element = document.body();
        System.out.println(element);
    }
}
