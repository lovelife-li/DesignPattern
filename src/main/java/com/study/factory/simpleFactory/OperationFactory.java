package com.study.factory.simpleFactory;

/**
 * @author ldb
 * @date 2019-09-16 10:05
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
