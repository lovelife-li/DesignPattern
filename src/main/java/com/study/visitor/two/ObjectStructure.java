package com.study.visitor.two;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ldb
 * @date 2020/04/17
 * @description 对象结构
 */
public class ObjectStructure {

    private List<Person> persons = new ArrayList<>();

    public void attach(Person person){
        persons.add(person);
    }

    public void detach(Person person){
        persons.remove(person);
    }

    public void display(Action visitor){
        for (Person person : persons) {
            person.accept(visitor);
        }
    }


}
