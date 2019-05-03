package com.kealliang.jsoup;

import com.kealliang.jsoup.utils.SoupVisitor;
import com.kealliang.utils.FileUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.*;

/**
 * @author lsr
 * @ClassName Jsoups
 * @Date 2019-03-12
 * @Desc jsoup工具
 * @Vertion 1.0
 */
@Component
public class Jsoups {

    private static Logger LOG = LoggerFactory.getLogger(Jsoups.class);

    /**
     * 遍历DOM树（jsoup中已提供了实现）
     * 循环 + 回溯 代替递归
     *
     * @see org.jsoup.select.NodeTraversor
     * @author lsr
     * @description traverse
     * @Date 16:22 2019/3/13
     * @Param [root]
     * @return void
     */
    public static void traverse(Node root, SoupVisitor visitor, Set<String> urls) {
        Node node = root;
        int depth = 0;

        //这里对树进行后序(深度优先)遍历
        while (node != null) {
            //开始遍历node
            visitor.head(node, urls);
            if (node.childNodeSize() > 0) {
                node = node.childNode(0);
                depth++;
            } else {
                //没有下一个兄弟节点，退栈（回溯）
                while (node.nextSibling() == null && depth > 0) {
                    visitor.tail(node, urls);
                    node = node.parent();
                    depth--;
                }
                //结束遍历
                visitor.tail(node, urls);
                if (node == root)
                    break;
                node = node.nextSibling();
            }
        }
    }

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

    /** 
     * 收集url
     * @author lsr
     * @description collectUrls
     * @Date 15:55 2019/3/15
     * @Param [url]
     */
    public static void collectUrls (String url, Set<String> urls) {
        SoupVisitor visitor = new SoupVisitor();
        Document doc = doc(url, null);
        if (doc == null) {
            return;
        }
        traverse(doc.root(), visitor, urls);
    }

    /** 
     * 获取所有的url的set集合
     * @author lsr
     * @description getAllUrls
     * @Date 18:19 2019/3/15
     * @Param [url]
     * @return java.util.Set<java.lang.String>
     */
    private static Set<String> getAllUrls(String url) {
        Set<String> urls = new HashSet<>();
        // 搞个新set避免并发修改异常
        Set<String> allUrls = new HashSet<>();
        collectUrls(url, urls);
        if (urls.size() > 0) {
            allUrls.addAll(urls);
            for (String s : urls) {
                collectUrls(s, allUrls);
            }
        }
        return allUrls;
    }

    public static void main(String[] args) throws IOException {
        String url = "http://www.baidu.com?wd=白皮书";
        Document document = doc(url, null);
        System.out.println(document.title());

//        Element element = document.body();
//        System.out.println(element);

        Set<String> allUrls = getAllUrls(url);
        FileUtils.write2File(allUrls, "urlsName.txt");

    }
}
