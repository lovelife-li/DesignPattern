package com.study.iterator;

/**
 * @author ldb
 * @date 2020/04/14
 * @description 客户端
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate a = new ConcreteAggregate();

        a.insert(0,"大鸟");
        a.insert(1,"小菜");
        a.insert(2,"行李");
        a.insert(3,"老外");
        a.insert(4,"公交内部员工");
        a.insert(5,"小偷");

//        ConcreteIterator i = new ConcreteIterator(a);
        ConcreteIteratorDesc i = new ConcreteIteratorDesc(a);


        Object item = i.first();
        while (!i.isDone()){
            System.out.printf("%s 请买车票！\r\n",i.currentItem());
            i.next();
        }


    }
}
