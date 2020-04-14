package com.study.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 具体聚集类
 */
public class ConcreteAggregate extends Aggregate {

    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int size() {
        return items.size();
    }

    public Object get(int index) {
        return items.get(index);
    }

    public void insert(int index, Object value) {
        items.add(index, value);
    }
}
