package com.study.factory.abstractFactory.three;

/**
 * @author ldb
 * @date 2019-09-25 17:20
 */
public interface IFactory {
    IUser createUser();

    IDepartment createDepartment();
}
