package com.study.interpreter.pattern;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 非终结符表达式
 */
public class NonterminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
