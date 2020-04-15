package com.study.chainofresponsibility.pattern;

/**
 * @author ldb
 * @date 2020/04/15
 * @description ??
 */
public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.printf("%s 处理请求 %s", this.getClass().getName(), request);
            System.out.println();
        } else if (successor != null) {
            // 转移到下一位
            successor.handleRequest(request);
        }
    }
}
