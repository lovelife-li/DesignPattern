package com.study.visitor.one;

import java.util.ArrayList;

/**
 * @author ldb
 * @date 2020/04/17
 * @description 客户端
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Man man1 = new Man();
        man1.action = "成功";
        persons.add(man1);

        Woman woman1 = new Woman();
        woman1.action = "成功";
        persons.add(woman1);

        Man man2 = new Man();
        man2.action = "失败";
        persons.add(man2);

        Woman woman2 = new Woman();
        woman2.action = "失败";
        persons.add(woman2);

        Man man3 = new Man();
        man3.action = "恋爱";
        persons.add(man3);

        Woman woman3 = new Woman();
        woman3.action = "恋爱";
        persons.add(woman3);

        for (Person person : persons) {
            person.getConclusion();
        }
    }
}
