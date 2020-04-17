package com.study.visitor.one;

/**
 * @author ldb
 * @date 2020/04/17
 * @description ??
 */
public class Woman extends Person {

    @Override
    public void getConclusion() {
        if ("成功".equals(action)) {
            System.out.printf("%s %s时，背后大多有一个不成功的男人。", this.getClass().getSimpleName(), action);
            System.out.println();
        } else if ("失败".equals(action)) {
            System.out.printf("%s %s时，眼泪汪汪，谁也劝不了。", this.getClass().getSimpleName(), action);
            System.out.println();
        } else if ("恋爱".equals(action)) {
            System.out.printf("%s %s时，。遇事懂也装不懂", this.getClass().getSimpleName(), action);
            System.out.println();
        }
    }
}
