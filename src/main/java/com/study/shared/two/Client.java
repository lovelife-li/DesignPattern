package com.study.shared.two;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 客户端
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory f = new WebSiteFactory();
        WebSite w1 = f.getWebSiteCategory("产品展示");
        w1.use();

        WebSite w2 = f.getWebSiteCategory("产品展示");
        w2.use();

        WebSite w3 = f.getWebSiteCategory("产品展示");
        w3.use();

        WebSite w4 = f.getWebSiteCategory("博客");
        w4.use();

        WebSite w5 = f.getWebSiteCategory("博客");
        w5.use();

        WebSite w6 = f.getWebSiteCategory("博客");
        w6.use();

        System.out.println("网站分类总数为：" + f.getWebSiteCoutn());

    }
}
