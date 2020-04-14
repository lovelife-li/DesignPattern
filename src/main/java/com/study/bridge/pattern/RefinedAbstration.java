package com.study.bridge.pattern;

/**
 * @author ldb
 * @date 2020/4/14
 * @dsscription
 */
public class RefinedAbstration extends Abstration {
    @Override
    public void operation() {
        implementor.operation();
    }
}
