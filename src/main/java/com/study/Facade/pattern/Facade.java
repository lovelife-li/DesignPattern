package com.study.Facade.pattern;

/**
 * @author ldb
 * @date 2019-09-25 11:23
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();

    }

    public void methodA()
    {
        System.out.println("\n方法组A()-—-");
        one.methodOne();
        two.methodTwo();
        four.methodFour();
    }

    public void methodB()
    {
        System.out.println("\n方法组B()-—-");
        one.methodOne();
        two.methodTwo();
    }
}
