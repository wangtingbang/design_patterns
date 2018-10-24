package me.sigh.designpatterns.behavioral.strategy;

import me.sigh.designpatterns.behavioral.strategy.stg.Strategy;
import me.sigh.designpatterns.behavioral.strategy.stg.impl.ConcreteStrategyA;
import me.sigh.designpatterns.behavioral.strategy.stg.impl.ConcreteStrategyB;

public class Client {

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();

        Context context = new Context();

        context.setStrategy(strategy);
        context.algorithm("client request");

        strategy = new ConcreteStrategyB();
        context.setStrategy(strategy);
        context.algorithm("client request");
    }
}
