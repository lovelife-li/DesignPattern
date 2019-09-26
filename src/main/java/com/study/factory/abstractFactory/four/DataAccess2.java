package com.study.factory.abstractFactory.four;


import static java.lang.Class.forName;

/**
 * @author ldb
 * @date 2019-09-25 17:49
 */
public class DataAccess2 {

    public static IUser createUser(String db) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException {
        IUser result = (IUser) forName(db).newInstance();
        return result;
    }

    public static IDepartment createDepartment(String db) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException {
        IDepartment result = (IDepartment) forName(db).newInstance();
        return result;
    }
}
