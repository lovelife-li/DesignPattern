package com.study.factory.abstractFactory.three;

/**
 * @author ldb
 * @date 2019-09-25 17:21
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
