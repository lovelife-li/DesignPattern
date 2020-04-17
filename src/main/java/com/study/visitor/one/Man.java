package com.study.visitor.one;

/**
 * @author ldb
 * @date 2020/04/17
 * @description ??
 */
public class Man extends Person {

    @Override
    public void getConclusion() {
        if ("成功".equals(action)) {
            System.out.printf("%s %s时，背后多半有一个伟大的女人。", this.getClass().getSimpleName(), action);
            System.out.println();
        } else if ("失败".equals(action)) {
            System.out.printf("%s %s时，闷头喝酒，谁也劝不动。", this.getClass().getSimpleName(), action);
            System.out.println();
        } else if ("恋爱".equals(action)) {
            System.out.printf("%s %s时，凡事不懂也要装懂。", this.getClass().getSimpleName(), action);
            System.out.println();
        }
    }
}
