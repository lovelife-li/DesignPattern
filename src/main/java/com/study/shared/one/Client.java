package com.study.shared.one;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 客户端
 */
public class Client {
    public static void main(String[] args) {

        WebSite fx = new WebSite("产品展示");
        fx.use();

        WebSite fy = new WebSite("产品展示");
        fy.use();

        WebSite fz = new WebSite("产品展示");
        fz.use();

        WebSite f1 = new WebSite("博客");
        f1.use();

        WebSite f2 = new WebSite("博客");
        f2.use();

        WebSite f3 = new WebSite("博客");
        f3.use();

    }
}
