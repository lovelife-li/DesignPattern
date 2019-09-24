package com.study.prototype.pattern;

/**
 * @author ldb
 * @date 2019-09-24 13:51
 */
public class ConcretePrototype1 extends Prototype {
    @Override
    public Prototype clone() {
        return new ConcretePrototype1(id);
    }

    public ConcretePrototype1(String id) {
        super(id);
    }
}
