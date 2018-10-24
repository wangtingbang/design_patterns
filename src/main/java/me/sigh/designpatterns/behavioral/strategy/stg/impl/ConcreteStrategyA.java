package me.sigh.designpatterns.behavioral.strategy.stg.impl;

import me.sigh.designpatterns.behavioral.strategy.stg.Strategy;

public class ConcreteStrategyA extends Strategy {
    @Override public void algorithm(String argv) {
        System.out.println("ConcreteStrategyA.algorithm: " + argv);
    }
}
