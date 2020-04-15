package com.study.chainofresponsibility.two;


/**
 * @author ldb
 * @date 2020/04/15
 * @description 总经理
 */
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestAppications(Request request) {
        if (request.getRequestType().equals("请假")) {
            System.out.printf("%s : %s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber());
            System.out.println();
        } else if (request.getRequestType().equals("加薪") && request.getNumber() <= 500) {
            System.out.printf("%s : %s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber());
            System.out.println();
        } else if (request.getRequestType().equals("加薪") && request.getNumber() > 500) {
            System.out.printf("%s : %s 数量 %s 再说吧", name, request.getRequestContent(), request.getNumber());
            System.out.println();
        }
    }
}
