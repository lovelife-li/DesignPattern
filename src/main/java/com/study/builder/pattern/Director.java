package com.study.builder.pattern;

/**
 * @author ldb
 * @date 2019-09-25 14:22
 */
public class Director {
    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
