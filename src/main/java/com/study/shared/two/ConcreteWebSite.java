package com.study.shared.two;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 具体网站类
 */
public class ConcreteWebSite extends WebSite {

    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("网站分类：" + name);
    }
}
