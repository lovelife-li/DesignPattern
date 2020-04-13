package com.study.decoration.one;

/**
 * @author ldb
 * @date 2019-09-20 15:51
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void wearTShirts() {
        System.out.println("大T恤");
    }

    public void wearBigTrouser() {
        System.out.println("垮裤");
    }

    public void wearSneakers() {
        System.out.println("破球鞋");
    }

    public void wearSuit() {
        System.out.println("西装");
    }

    public void wearTie() {
        System.out.println("领带");
    }

    public void wearLeatherShoes() {
        System.out.println("皮鞋");
    }

    public void show() {
        System.out.printf("装扮的%s", name);
    }

}

