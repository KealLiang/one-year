package com.kealliang.service;

/**
 * @author lsr
 * @ClassName LockDemoService
 * @Date 2019-01-18
 * @Desc 锁演示service
 * @Vertion 1.0
 */
public interface LockDemoService {

    // DeadLock
    // 产生条件
    // 1、不能是表级锁
    // 2、不同方向加锁
    // 3、事务中存在持有并索要资源的情况（例如循环更新）
    void forwardUpdate();
    void backwardUpdate();

    // GapLock导致的死锁
    // 产生条件
    // 1、更新不存在的记录
    // 2、更新辅助索引上存在的记录k（为防幻读会锁k前一条到后一条之间的区间）
    // 3、事务级别为RR
    void gapTest(int id);


    // init
    void initData();

    void impossible();
}
