package com.study.templateMethod.parttern;

/**
 * @author ldb
 * @date 2019-09-24 16:31
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass c;
        c = new ConcreteClassA();
        c.templateMethod();

        c = new ConcreteClassB();
        c.templateMethod();
    }
}
