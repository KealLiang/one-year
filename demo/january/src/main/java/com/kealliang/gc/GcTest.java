package com.kealliang.gc;

/**
 * @author lsr
 * @Date 2018-08-19
 * @Desc 垃圾回收测试
 */
public class GcTest {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        testAllocation();
    }

    /**
     * VM参数： -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    public static void testAllocation() {
        byte[] store1, store2, store3, store4;
        store1 = new byte[2 * _1MB];
        store2 = new byte[2 * _1MB];
        store3 = new byte[2 * _1MB];
        store4 = new byte[4 * _1MB]; //出现一次Minor GC
    }
}
