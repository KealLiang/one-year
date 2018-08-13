package com.kealliang.february.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author lsr
 * @Date 2018-08-03
 * @Desc
 */
public interface DemoService {

    /**
     * 打印当前线程名字
     */
    void printCurrentThread();

    Date printNowDate();

    /**
     * 并发更新实验
     */
    void concurrentUpdate();
    /**
     * 并发更新实验2
     */
    void concurrentUpdate2();

    @Transactional
    void concurrentExperiment();

    @Transactional
    void concurrentExperitment2();

    void gapLock();

    void gapLock2();
}
