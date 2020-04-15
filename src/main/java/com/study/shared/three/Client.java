package com.study.shared.three;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 客户端
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory f = new WebSiteFactory();
        WebSite w1 = f.getWebSiteCategory("产品展示");
        w1.use(new User("小菜"));

        WebSite w2 = f.getWebSiteCategory("产品展示");
        w2.use(new User("大鸟"));

        WebSite w3 = f.getWebSiteCategory("产品展示");
        w3.use(new User("小巴"));

        WebSite w4 = f.getWebSiteCategory("博客");
        w4.use(new User("小白"));

        WebSite w5 = f.getWebSiteCategory("博客");
        w5.use(new User("小黑"));

        WebSite w6 = f.getWebSiteCategory("博客");
        w6.use(new User("小花"));

        System.out.println("网站分类总数为：" + f.getWebSiteCoutn());

    }
}
