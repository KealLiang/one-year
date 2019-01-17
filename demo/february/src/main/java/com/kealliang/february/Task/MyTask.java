package com.kealliang.february.Task;

import java.util.TimerTask;

/**
 * @author lsr
 * @ClassName MyTask
 * @Date 2018-09-27
 * @Desc 测试任务
 * @Vertion 1.0
 */
public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("燃烧我的卡路里~");
    }
}
