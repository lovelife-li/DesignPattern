package com.study.interpreter.pattern;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 抽象表达式
 */
public abstract class AbstractExpression {
    public abstract void interpret(Context context);
}
