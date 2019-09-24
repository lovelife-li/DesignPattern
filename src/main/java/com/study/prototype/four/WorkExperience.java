package com.study.prototype.four;

import lombok.Data;

/**
 * @author ldb
 * @date 2019-09-24 15:33
 */
@Data
public class WorkExperience implements Cloneable {
    private String workDate;
    private String company;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
