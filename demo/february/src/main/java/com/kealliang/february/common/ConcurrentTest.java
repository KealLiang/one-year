package com.kealliang.february.common;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * @author lsr
 * @Date 2018-08-05
 * @Desc 并发测试类
 */
public class ConcurrentTest {

    //方法一：使用volatile修饰
    private static volatile boolean stopThread = false;

    private static long i = 0L; //this thread's value

    //方法二：使用同步的访问与修改方法（必须两个方法都同步）
//    private static synchronized void stopRequest(){
//        stopThread = true;
//    }
//    private static synchronized boolean stopThread(){
//        return stopThread;
//    }

    public static void main(String[] args) throws InterruptedException {
//        printValueThread();

        //构建一个后台线程
        Thread backgroundThread = new Thread(() -> {
            /**
             * while(!stopThread) i++;
             *
             * 将被优化为：
             * if(!stopThread)
             *  while(true)
             *      i++;
             *
             * 原因是没有同步，因此不能保证后台线程何时能看到主线程对stopThread的变更
             * 因此后台线程永远无法停止
             */
            while(!stopThread) i++;
        });
        //后台线程开跑
        backgroundThread.start();

        //主线程sleep 1秒
        TimeUnit.SECONDS.sleep(1);
        //由主线程停止后台线程
        stopThread = true;
//        stopRequest();
        System.out.println(i);
        System.err.println("执行完毕！！！  并非打印了就真正执行完毕！！！");

    }

    private static void printValueThread() {
        Thread printThread = new Thread(() -> System.out.println(i));
        printThread.start();
    }
}
