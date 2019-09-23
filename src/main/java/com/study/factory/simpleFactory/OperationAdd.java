package com.study.factory.simpleFactory;

import java.math.BigDecimal;

/**
 * @author ldb
 * @date 2019-09-16 9:49
 */
public class OperationAdd extends Operation {

    @Override
    public BigDecimal getResult() {

        BigDecimal result;
        result = numberA.add(numberB);
        return result;
    }
}
