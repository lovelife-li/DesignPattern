package com.study.Mediator.one;

import lombok.Setter;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 联合国安理事会
 */
@Setter
public class UnitedNationsSecurityCouncil extends UnitedNations {

    private USA colleague1;
    private Iraq colleague2;

    @Override
    public void delare(String message, Country colleague) {
        if (colleague == colleague1) {
            colleague2.getMessage(message);
        } else {
            colleague1.getMessage(message);
        }
    }
}
