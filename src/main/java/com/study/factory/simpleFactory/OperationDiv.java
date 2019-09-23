package com.study.factory.simpleFactory;

import java.math.BigDecimal;

/**
 * @author ldb
 * @date 2019-09-16 9:49
 */
public class OperationDiv extends Operation {

    @Override
    public BigDecimal getResult() {
        BigDecimal result;
        result = numberA.divide(numberB);
        return result;
    }
}
