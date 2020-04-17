package com.study.visitor.two;


/**
 * @author ldb
 * @date 2020/04/17
 * @description 成功
 */
public class Success extends Action {

    @Override
    public void getManConclusion(Man itemA) {
        System.out.printf("%s %s时，背后多半有一个伟大的女人。", itemA.getClass().getSimpleName(), this.getClass().getSimpleName());
        System.out.println();
    }

    @Override
    public void getWomanConclusion(Woman itemB) {
        System.out.printf("%s %s时，背后大多有一个不成功的男人。", itemB.getClass().getSimpleName(), this.getClass().getSimpleName());
        System.out.println();
    }
}
