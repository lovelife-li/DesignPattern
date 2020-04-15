package com.study.chainofresponsibility.pattern;

/**
 * @author ldb
 * @date 2020/04/15
 * @description ??
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.printf("%s 处理请求 %s", this.getClass().getName(), request);
            System.out.println();
        } else if (successor != null) {
            // 转移到下一位
            successor.handleRequest(request);
        }
    }
}
