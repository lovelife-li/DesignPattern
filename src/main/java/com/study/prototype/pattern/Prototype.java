package com.study.prototype.pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ldb
 * @date 2019-09-24 13:48
 */
@Data
@AllArgsConstructor
public abstract class Prototype {

    public String id;

    public abstract Prototype clone();

}
