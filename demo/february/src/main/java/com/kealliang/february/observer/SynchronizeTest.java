package com.kealliang.february.observer;

import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lsr
 * @Date 2018-08-05
 * @Desc 测试过度同步
 */
public class SynchronizeTest {

    public static void main(String[] args) {
        ObservableSet<Integer> set = new ObservableSet<>(new HashSet<Integer>());

        //注册一个观察者，实现回调接口
//        set.registObserver((s, e) -> {
//            System.out.println(e);
//            if(23 == e) s.removeObserver(this); //使用lambda时，此处的this会报错
//        });
        set.registObserver(new SetObserver<Integer>() {
            @Override
            public void added(ObservableSet<Integer> s, Integer e) {
                System.out.println(e);
//                if(23 == e) s.removeObserver(this); //ConcurrentModificationException

                //使用一个新的线程去取消（正常不会这么干）
                if(23 == e){
                    ExecutorService executor = Executors.newSingleThreadExecutor();

                    final SetObserver<Integer> observer = this;
                    try {
                        executor.submit(() -> s.removeObserver(observer)).get();
                    } catch (InterruptedException e1) {
                        throw new AssertionError(e1.getCause());
                    } catch (ExecutionException e1) {
                        throw new AssertionError(e1.getCause());
                    } finally {
                        executor.shutdown();
                    }
                }

            }
        });

        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
    }
}
