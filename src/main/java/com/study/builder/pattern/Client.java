package com.study.builder.pattern;

/**
 * @author ldb
 * @date 2019-09-25 14:22
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
        ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();

        director.construct(concreteBuilder1);
        Product p1 = concreteBuilder1.getResult();
        p1.show();


        director.construct(concreteBuilder2);
        Product p2 = concreteBuilder2.getResult();
        p2.show();



    }
}
