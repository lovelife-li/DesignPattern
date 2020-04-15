package com.study.Mediator.one;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 国家
 */
public abstract class Country {
    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
}
