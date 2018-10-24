package me.sigh.designpatterns.behavioral.strategy;

import me.sigh.designpatterns.behavioral.strategy.stg.Strategy;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm(String argv){
        System.out.println("Context.algorithm, request Strategy.algorithm: " + argv);
        strategy.algorithm(argv);
    }
}
