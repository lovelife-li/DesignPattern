package com.study.interpreter.one;

/**
 * @author ldb
 * @date 2020/04/17
 * @description 演奏速度
 */
public class Speed extends Expression {
    @Override
    public void execute(String key, double value) {
        String speed;
        if (value < 500) {
            speed = "快速";
        } else if (value >= 1000) {
            speed = "慢速";
        } else {
            speed = "中速";
        }
        System.out.print(speed + " ");
    }
}
