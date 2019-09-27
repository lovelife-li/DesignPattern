package com.study.state.pattern;

/**
 * @author ldb
 * @date 2019-09-26 10:14
 */
public class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
