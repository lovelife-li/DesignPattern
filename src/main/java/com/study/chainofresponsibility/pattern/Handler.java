package com.study.chainofresponsibility.pattern;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 处理请求接口
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(int request);
}
