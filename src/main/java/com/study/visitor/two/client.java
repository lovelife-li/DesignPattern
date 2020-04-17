package com.study.visitor.two;

/**
 * @author ldb
 * @date 2020/04/17
 * @description 客户端
 */
public class client {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        Success success = new Success();
        o.display(success);

        Fail fail = new Fail();
        o.display(fail);

        Amativeness amativeness = new Amativeness();
        o.display(amativeness);
    }
}
