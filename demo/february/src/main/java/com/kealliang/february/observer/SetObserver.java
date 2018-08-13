package com.kealliang.february.observer;

/**
 * @author lsr
 * @Date 2018-08-05
 * @Desc 观察者本体
 */
@FunctionalInterface
public interface SetObserver<E> {
    //当元素E加入可观察集合时，回调此方法
    void added(ObservableSet<E> s, E e);
}
