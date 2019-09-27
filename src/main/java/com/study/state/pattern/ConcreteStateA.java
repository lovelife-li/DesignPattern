package com.study.state.pattern;

/**
 * @author ldb
 * @date 2019-09-26 10:12
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());

    }
}
