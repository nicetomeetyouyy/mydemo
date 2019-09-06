package com.xjm.demo.Iterator;

/**
 * 迭代器模式
 */
public interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();
}
