package com.study.factory.simpleFactory;

/**
 * @author ldb;
 * @date 2020/4/13 9:00
 * @description
 * 业务类：
 * 子类：每一种运算都是一个累，比如加法类。
 * 父类：每个运算类都有共同的东西，getResult() 得到运算结果
 *
 * 界面类：（启动类）
 * 找到运算子类（通过简单工厂），得到结果。
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {

        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
            default:
                System.out.println("未识别符号");
        }

        return oper;

    }
}
