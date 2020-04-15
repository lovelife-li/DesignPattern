package com.study.shared.three;

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
    public void use(User user) {
        System.out.println("网站分类：" + name + "用户：" + user.getName());
    }
}
