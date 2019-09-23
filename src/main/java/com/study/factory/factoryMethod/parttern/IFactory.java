package com.study.factory.factoryMethod.parttern;

import com.study.factory.simpleFactory.Operation;

/**
 * @author ldb
 * @date 2019-09-23 16:30
 */
public interface IFactory {

    Operation createOperation();
}
