package com.study.interpreter.pattern;

import java.util.ArrayList;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 客户端
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        ArrayList<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression expression : list) {
            expression.interpret(context);
        }
    }
}
