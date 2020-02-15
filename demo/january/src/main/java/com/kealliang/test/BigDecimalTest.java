package com.kealliang.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lsr
 * @ClassName BigDecimalTest
 * @Date 2019-11-07
 * @Desc 测试BigDecimal，注意坑点
 * @Vertion 1.0
 */
public class BigDecimalTest {

    public static void main(String[] args) {
        String aa = "123";
        List<BigDecimal> list = new ArrayList<>();
        list.add(new BigDecimal("50"));
        list.add(new BigDecimal("30"));
        list.add(new BigDecimal("20"));
        BigDecimal reduce = list.stream().reduce(new BigDecimal("0.00"), (a, b) -> a.add(b));
        // 坑点：此处的初始化值若使用了数值型的BigDecimal构造器，计算结果将是100，不等于100.0
//        BigDecimal reduce = list.stream().reduce(new BigDecimal(0.0), (a, b) -> a.add(b));
        System.out.println(reduce.toString());
        System.out.println(reduce.compareTo(new BigDecimal("100.0")) == 0);


        BigDecimal a = new BigDecimal("100");
        BigDecimal b = new BigDecimal("100.0");
//		System.out.println(a.equals(b));

        aa = aa + null;
//		System.out.println(aa);
    }
}
