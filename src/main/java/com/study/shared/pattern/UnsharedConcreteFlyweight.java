package com.study.shared.pattern;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 不需要共享具体类
 */
public class UnsharedConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不需要共享具体flyweight:" + extrinsicstate);
    }
}
