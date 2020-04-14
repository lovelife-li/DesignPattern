package com.study.bridge.pattern;

/**
 * @author ldb
 * @date 2020/4/14
 * @dsscription
 */
public class ConcreteImplementorA extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }
}
