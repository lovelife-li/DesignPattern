package com.study.bridge.pattern;

/**
 * @author ldb
 * @date 2020/4/14
 * @dsscription
 */
public class Client {
    public static void main(String[] args) {
        Abstration ab = new RefinedAbstration();

        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
