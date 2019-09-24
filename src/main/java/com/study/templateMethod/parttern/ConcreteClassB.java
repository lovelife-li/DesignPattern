package com.study.templateMethod.parttern;

/**
 * @author ldb
 * @date 2019-09-24 16:30
 */
public class ConcreteClassB extends AbstractClass{
    @Override
    public void primitiveOperationl() {
        System.out.println("具体类B方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类B方法2实现");
    }
}
