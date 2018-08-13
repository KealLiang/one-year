package com.kealliang.february.composition;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * @author lsr
 * @Date 2018-08-05
 * @Desc 复合优先于继承--转发Set
 */
public class ForwardingSet<E> implements Set<E> {

    //功能实现全部转发给传入的set
    private final Set<E> s;

    public ForwardingSet(Set<E> s) {
        this.s = s;
    }

    @Override
    public int size() {
        return s.size();
    }

    @Override
    public boolean isEmpty() {
        return s.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return s.contains(o);
    }

    @Override
    public Iterator iterator() {
        return s.iterator();
    }

    @Override
    public Object[] toArray() {
        return s.toArray();
    }

    @Override
    public boolean add(E o) {
        return s.add(o);
    }

    @Override
    public boolean remove(Object o) {
        return s.remove(o);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return s.addAll(c);
    }

    @Override
    public void clear() {
        s.clear();
    }

    @Override
    public boolean removeAll(Collection c) {
        return s.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection c) {
        return s.retainAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return s.containsAll(c);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return s.toArray(a);
    }
}
