package com.kealliang.february.service.impl;

import com.kealliang.february.Task.MyTask;
import org.junit.Test;

import java.util.Date;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

/**
 * @author lsr
 * @ClassName TimerTest
 * @Date 2018-09-27
 * @Desc 测试Timer使用
 * @Vertion 1.0
 */
public class TimerTest {

    @Test
    public void testTask(){
        Timer timer = new Timer();
        timer.schedule(new MyTask(), new Date(), 1000);

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
