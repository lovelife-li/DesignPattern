package com.study.state.pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

/**
 * @author ldb
 * @date 2019-09-26 10:12
 */
@Data
@AllArgsConstructor
public class Context {
    private State state;

    public void request() {
        state.handle(this);
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态：" + state.getClass().getName());
    }
}
