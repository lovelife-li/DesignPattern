package com.study.chainofresponsibility.two;


/**
 * @author ldb
 * @date 2020/04/15
 * @description 总监
 */
public class Majordomo extends Manager {

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestAppications(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
            System.out.printf("%s : %s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber());
            System.out.println();
        } else {
            if (superior != null) {
                superior.requestAppications(request);
            }
        }
    }
}
