package com.study.chainofresponsibility.one;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 管理者
 */
public class Manager {
    protected String name;

    public Manager(String name) {
        this.name = name;
    }

    public void getResult(String managerLevel, Request request) {
        if (managerLevel == "经理") {
            if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {
                System.out.printf("%s : %s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber());
                System.out.println();
            } else {
                System.out.printf("%s : %s 数量 %s 我无权处理", name, request.getRequestContent(), request.getNumber());
                System.out.println();
            }
        } else if (managerLevel == "总监") {
            if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
                System.out.printf("%s : %s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber());
                System.out.println();
            } else {
                System.out.printf("%s : %s 数量 %s 我无权处理", name, request.getRequestContent(), request.getNumber());
                System.out.println();
            }
        } else if (managerLevel == "总经理") {
            if (request.getRequestType().equals("请假")) {
                System.out.printf("%s : %s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber());
                System.out.println();
            } else if(request.getRequestType().equals("加薪") && request.getNumber() <= 500) {
                System.out.printf("%s : %s 数量 %s 被批准", name, request.getRequestContent(), request.getNumber());
                System.out.println();
            } else if(request.getRequestType().equals("加薪") && request.getNumber() > 500) {
                System.out.printf("%s : %s 数量 %s 再说吧", name, request.getRequestContent(), request.getNumber());
                System.out.println();
            }
        }
    }
}
