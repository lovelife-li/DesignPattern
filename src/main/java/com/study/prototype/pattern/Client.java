package com.study.prototype.pattern;

/**
 * @author ldb
 * @date 2019-09-24 14:23
 */
public class Client {
    public static void main(String[] args) {
        Prototype p1 = new ConcretePrototype1("a");
        Prototype c1 = p1.clone();
        System.out.printf("Cloned:%s", c1.getId());

    }

}
