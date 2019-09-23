package com.study.strategy.parttern;

/**
 * @author ldb
 * @date 2019-09-23 15:06
 */
public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // 上下文接口
    public void contextInterface(){
        strategy.AlgorithmInterface();
    }
}
