package com.study.factory.simpleFactory;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author ldb
 * @date 2019-09-16 9:41
 */
@Data
public abstract class Operation {

    public BigDecimal numberA = null;
    public BigDecimal numberB = null;

    public abstract BigDecimal getResult();


}
