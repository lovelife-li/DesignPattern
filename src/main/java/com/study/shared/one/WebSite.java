package com.study.shared.one;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 网站
 */
public class WebSite {
    private String name;

    public WebSite(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println("网站分类：" + name);
    }
}
