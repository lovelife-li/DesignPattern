package com.study.visitor.two;

/**
 * @author ldb
 * @date 2020/04/17
 * @description 男人
 */
public class Man extends Person {

    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
