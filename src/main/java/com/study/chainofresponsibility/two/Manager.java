package com.study.chainofresponsibility.two;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 管理者
 */
public abstract class Manager {

    protected String name;

    // 管理者的上级
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    // 申请请求
    public abstract void requestAppications(Request request);
}
