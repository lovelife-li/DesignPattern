package com.study.observer.pattern;

import lombok.Data;

/**
 * @author ldb
 * @date 2019-09-25 16:04
 */
@Data
public class ConcreteObserver extends Observer {

    private String name;
    private String observerState;
    private ConcreteSubject subject;

    @Override
    public void update() {
        observerState = subject.getSubjectState();
        System.out.printf("观察者%s的新状态是%s", name, observerState);
        System.out.println();
    }

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.name = name;
        this.subject = subject;
    }
}
