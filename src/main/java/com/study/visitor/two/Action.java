package com.study.visitor.two;


/**
 * @author ldb
 * @date 2020/04/17
 * @description 抽象状态
 */
public abstract class Action {

    public abstract void getManConclusion(Man itemA);

    public abstract void getWomanConclusion(Woman itemB);

}
