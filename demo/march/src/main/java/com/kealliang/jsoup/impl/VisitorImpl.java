package com.kealliang.jsoup.impl;

import com.kealliang.jsoup.Visitor;
import org.jsoup.nodes.Node;
import org.springframework.stereotype.Service;

/**
 * @author lsr
 * @ClassName VisitorImpl
 * @Date 2019-03-13
 * @Desc
 * @Vertion 1.0
 */
@Service
public class VisitorImpl implements Visitor {
    @Override
    public void head(Node node, int depth) {
        System.out.println(depth + " -head- " + node.nodeName());
    }

    @Override
    public void tail(Node node, int depth) {
        System.out.println(depth + " -tail- " + node.nodeName());
    }
}
