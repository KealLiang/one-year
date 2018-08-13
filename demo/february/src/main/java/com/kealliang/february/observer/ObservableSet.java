package com.kealliang.february.observer;

import com.kealliang.february.composition.ForwardingSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @author lsr
 * @Date 2018-08-05
 * @Desc 可观察的集合
 */
public class ObservableSet<E> extends ForwardingSet<E> {
    public ObservableSet(Set<E> s) {
        super(s);
    }

    //维护观察者的对象
    //使对观察者的一切操作都是同步的
    private final List<SetObserver<E>> observers = new ArrayList<>();

    //注册与取消方法--均为同步的
    public void registObserver(SetObserver<E> set) {
        synchronized (observers) {
            observers.add(set);
        }
    }

    public boolean removeObserver(SetObserver<E> set) {
        synchronized (observers) {
            return observers.remove(set);
        }
    }

    //回调时也是同步的--问题就在于此，不要在同步块中调用外来（alien）方法
  /*  private void notifyAdded(E e) {
        synchronized (observers) {
            for (SetObserver<E> o : observers) {
                o.added(this, e);
            }
        }
    }*/
    //解法：将外来调用移除同步代码块
    private void notifyAdded(E e) {
        List<SetObserver<E>> snapshot;
        synchronized (observers) {
            snapshot = new ArrayList<>(observers);
        }
        for (SetObserver<E> o : snapshot) {
            o.added(this, e);
        }
    }

    @Override
    public boolean add(E e) {
        boolean added = super.add(e);
        if (added)
            notifyAdded(e);
        return added;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean result = false;
        for (E e : c) {
            result |= add(e); //只要有一个成功即为成功
        }
        return result;
    }

}
