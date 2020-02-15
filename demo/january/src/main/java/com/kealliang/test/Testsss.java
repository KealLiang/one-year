package com.kealliang.test;

/**
 * @author lsr
 * @ClassName Testsss
 * @Date 2019-09-03
 * @Desc
 * @Vertion 1.0
 */
public class Testsss {

    private int count = 0;

    private void add(){
        int i = 0;
        while(i++ < 10000){
            count++;
        }
    }

    public static void main(String[] args) {
        Testsss te = new Testsss();
        Thread thread1 = new Thread(() -> {
            te.add();
        });
        Thread thread2 = new Thread(() -> {
            te.add();
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(te.count);
    }
}
