package com.study.shared.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ldb
 * @date 2020/04/15
 * @description 享元工厂
 */
public class FlyweightFactory {

    private Map<String, Flyweight> flyweights = new HashMap();

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return flyweights.get(key);
    }
}
