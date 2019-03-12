package com.kealliang.jsoup;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * @author lsr
 * @ClassName Jsoups
 * @Date 2019-03-12
 * @Desc jsoup工具
 * @Vertion 1.0
 */
public class Jsoups {


    public static void main(String[] args) throws IOException {
        String url = "https://www.baidu.com";
        Connection connect = Jsoup.connect(url);
        Document document = connect.get();
        System.out.println(document.title());
//        System.out.println(document.body());
    }
}
