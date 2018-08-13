package com.kealliang.february.common;

/**
 * @author lsr
 * @Date 2018-08-05
 * @Desc 使用main方法进行的简单测试
 */
public class SampleTest {

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        long beginNano = System.nanoTime();

        //todo
        calculateBoxingAndUnBoxingTime();
//        countCanBuyItems();

        System.out.println(System.currentTimeMillis() - begin);
        System.out.println(System.nanoTime() - beginNano);
    }

    private static void calculateBoxingAndUnBoxingTime() {
        //don't do this!
        //use Long time consume is 6398 millis
        //use long time consume is 639 millis
        Long sum = 0L;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    /**
     * 货架上有0.1 .2 .3 ...的商品
     * 你有1元，计算能买多少，还剩多少
     */
    private static void countCanBuyItems() {
        double fund = 1.0;
        int itemCount = 0;
        for (double price = .1; fund >= price; price += .1) {
            fund -= price;
            itemCount++;
        }
        System.out.println(itemCount);
        System.out.println(fund);
    }
}
