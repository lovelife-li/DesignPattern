package com.study.decoration.two;

/**
 * @author ldb
 * @date 2019-09-20 16:40
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.printf("装扮的%s", name);
    }
}
