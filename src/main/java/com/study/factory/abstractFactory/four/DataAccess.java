package com.study.factory.abstractFactory.four;


/**
 * @author ldb
 * @date 2019-09-25 17:49
 */
public class DataAccess {
    private static final String db = "sqlserver";
//    private static final String db = "access";


    public static IUser createUser() {
        IUser result = null;
        switch (db) {
            case "sqlserver":
                result = new SqlServerUser();
                break;
            case "access":
                result = new AccessUser();
                break;
            default:
        }
        return result;
    }

    public static IDepartment createDepartment() {
        IDepartment result = null;
        switch (db) {
            case "sqlserver":
                result = new SqlServerDepartment();
                break;
            case "access":
                result = new AccessDepartment();
                break;
            default:
        }
        return result;
    }
}
