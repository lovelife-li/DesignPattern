package com.study.iterator;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 具体迭代器，从后向前遍历
 */
public class ConcreteIteratorDesc extends Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        current = aggregate.size() - 1;
    }

    @Override
    public Object first() {
        return aggregate.get(aggregate.size() - 1);
    }

    @Override
    public Object next() {
        Object ret = null;
        current--;
        if (current >= 0) {
            ret = aggregate.get(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current < 0 ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.get(current);
    }
}
