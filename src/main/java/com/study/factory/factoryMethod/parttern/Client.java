package com.study.factory.factoryMethod.parttern;

import com.study.factory.simpleFactory.Operation;

import java.math.BigDecimal;

/**
 * @author ldb
 * @date 2019-09-23 16:34
 */
public class Client {
    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.numberA = new BigDecimal(1);
        operation.numberB = new BigDecimal(2);
        BigDecimal result = operation.getResult();
        System.out.println(result.intValue());

    }
}
