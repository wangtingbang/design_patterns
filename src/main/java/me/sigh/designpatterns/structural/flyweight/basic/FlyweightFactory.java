package me.sigh.designpatterns.structural.flyweight.basic;

import me.sigh.designpatterns.structural.flyweight.basic.impl.ConcreteFlyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        }
        Flyweight flyweight = new ConcreteFlyweight();

        flyweights.put(key, flyweight);
        return flyweight;
    }
}
