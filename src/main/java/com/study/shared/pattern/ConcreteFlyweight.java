package com.study.shared.pattern;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 具体类
 */
public class ConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体flyweight:" + extrinsicstate);
    }
}
