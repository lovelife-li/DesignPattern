package com.study.interpreter.one;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 音符类
 */
public class Scale extends Expression {

    @Override
    public void execute(String key, double value) {
        String scale = "" ;
        switch (Double.valueOf(value).intValue()){
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;


        }
        System.out.println(scale);
    }
}
