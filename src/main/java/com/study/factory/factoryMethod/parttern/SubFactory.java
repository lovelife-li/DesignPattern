package com.study.factory.factoryMethod.parttern;

import com.study.factory.simpleFactory.Operation;
import com.study.factory.simpleFactory.OperationAdd;
import com.study.factory.simpleFactory.OperationSub;

/**
 * @author ldb
 * @date 2019-09-23 16:31
 */
public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
