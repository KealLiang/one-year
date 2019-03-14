package com.kealliang.jsoup;

import org.jsoup.nodes.Node;

/**
 * @author lsr
 * @ClassName Visitor
 * @Date 2019-03-13
 * @Desc node访问器
 * @Vertion 1.0
 */
public interface Visitor {

    /** 
     * 前置访问
     * @author lsr
     * @description head
     * @Date 16:21 2019/3/13
     * @Param [node, depth]
     * @return void
     */
    void head(Node node, int depth);

    /** 
     * 后置访问
     * @author lsr
     * @description tail
     * @Date 16:21 2019/3/13
     * @Param [node, depth]
     * @return void
     */
    void tail(Node node, int depth);
}
