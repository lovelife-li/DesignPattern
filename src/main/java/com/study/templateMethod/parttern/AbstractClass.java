package com.study.templateMethod.parttern;

/**
 * @author ldb
 * @date 2019-09-24 16:28
 */
public abstract class AbstractClass {
    public abstract void primitiveOperationl();

    public abstract void primitiveOperation2();

    public void templateMethod(){
        primitiveOperationl();
        primitiveOperation2();
    }

}
