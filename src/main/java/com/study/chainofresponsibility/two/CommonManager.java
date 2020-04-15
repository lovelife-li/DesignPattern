package com.study.chainofresponsibility.two;


/**
 * @author ldb
 * @date 2020/04/15
 * @description 经理
 */
public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestAppications(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {
            System.out.printf("%s : %s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber());
            System.out.println();
        } else {
            if (superior != null) {
                superior.requestAppications(request);
            }
        }
    }
}
