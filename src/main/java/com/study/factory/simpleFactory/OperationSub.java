package com.study.factory.simpleFactory;

import java.math.BigDecimal;

/**
 * @author ldb
 * @date 2019-09-16 9:49
 */
public class OperationSub extends Operation {

    @Override
    public BigDecimal getResult() {
        BigDecimal result;
        result = numberA.subtract(numberB);
        return result;
    }
}
