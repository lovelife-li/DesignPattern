package com.study.factory.factoryMethod.parttern;

import com.study.factory.simpleFactory.Operation;
import com.study.factory.simpleFactory.OperationAdd;

/**
 * @author ldb
 * @date 2019-09-23 16:31
 */
public class AddFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
