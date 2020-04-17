package com.study.visitor.two;

/**
 * @author ldb
 * @date 2020/04/17
 * @description 恋爱
 */
public class Amativeness extends Action {

    @Override
    public void getManConclusion(Man itemA) {
        System.out.printf("%s %s时，凡事不懂也要装懂。", itemA.getClass().getSimpleName(), this.getClass().getSimpleName());
        System.out.println();
    }

    @Override
    public void getWomanConclusion(Woman itemB) {
        System.out.printf("%s %s时，遇事懂也装不懂。", itemB.getClass().getSimpleName(), this.getClass().getSimpleName());
        System.out.println();
    }
}
