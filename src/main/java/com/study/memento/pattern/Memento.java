package com.study.memento.pattern;

import lombok.Getter;

/**
 * @author ldb
 * @date 2019-11-08 15:46
 */
@Getter
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
