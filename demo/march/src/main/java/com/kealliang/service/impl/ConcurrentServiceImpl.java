package com.kealliang.service.impl;

import com.kealliang.service.ConcurrentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lsr
 * @ClassName ConcurrentServiceImpl
 * @Date 2019-02-18
 * @Desc
 * @Vertion 1.0
 */
@Service
public class ConcurrentServiceImpl implements ConcurrentService {

    private List<Integer> nums = new ArrayList<>();

    @Override
    public void add() {
        Thread t1 = new Thread(new ModifyNums());
        Thread t2 = new Thread(new ModifyNums());
        t1.start();
        t2.start();
    }

    private class ModifyNums implements Runnable {

        @Override
        public void run() {
            while (nums.size() != 10) {
                nums.add(1);
                System.out.println(Thread.currentThread().getName() + " --> " + nums.size());
            }
        }
    }

    public static void main(String[] args) {
        ConcurrentServiceImpl c = new ConcurrentServiceImpl();
        Thread t1 = new Thread(c.new ModifyNums());
        Thread t2 = new Thread(c.new ModifyNums());
        Thread t3 = new Thread(c.new ModifyNums());
        t1.start();
        t2.start();
        t3.start();
    }
}
