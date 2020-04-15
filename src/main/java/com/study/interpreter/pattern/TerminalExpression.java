package com.study.interpreter.pattern;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 终结符表达式
 */
public class TerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
