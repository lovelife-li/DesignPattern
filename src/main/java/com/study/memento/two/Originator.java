package com.study.memento.two;

import lombok.Data;

/**
 * @author ldb
 * @date 2019-11-08 15:45
 */
@Data
public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void show() {
        System.out.println("state=" + state);
    }
}
