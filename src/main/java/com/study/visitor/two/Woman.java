package com.study.visitor.two;

/**
 * @author ldb
 * @date 2020/04/17
 * @description 女人
 */
public class Woman extends Person {

    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}
