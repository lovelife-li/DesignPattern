package com.study.bridge.pattern;

/**
 * @author ldb
 * @date 2020/4/14
 * @dsscription
 */
public class ConcreteImplementorB extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现B的方法执行");
    }
}
