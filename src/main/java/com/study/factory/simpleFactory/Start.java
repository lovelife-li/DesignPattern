package com.study.factory.simpleFactory;

import java.math.BigDecimal;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ldb
 * @date 2019-09-16 10:12
 */
public class Start {


    public static void main(String[] args) {

        Operation operation = OperationFactory.createOperation("/");
        operation.numberA = new BigDecimal(15);
        operation.numberB = new BigDecimal(1);  // 没有判断0
        BigDecimal result = operation.getResult();
        System.out.println(result.doubleValue());

        new ReentrantLock();

    }
}
