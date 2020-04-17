package com.study.visitor.two;


/**
 * @author ldb
 * @date 2020/04/17
 * @description 失败
 */
public class Fail extends Action {

    @Override
    public void getManConclusion(Man itemA) {
        System.out.printf("%s %s时，闷头喝酒，谁也劝不动。", itemA.getClass().getSimpleName(), this.getClass().getSimpleName());
        System.out.println();
    }

    @Override
    public void getWomanConclusion(Woman itemB) {
        System.out.printf("%s %s时，眼泪汪汪，谁也劝不了。", itemB.getClass().getSimpleName(), this.getClass().getSimpleName());
        System.out.println();
    }
}
