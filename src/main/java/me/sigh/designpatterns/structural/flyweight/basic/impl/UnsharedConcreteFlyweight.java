package me.sigh.designpatterns.structural.flyweight.basic.impl;

import me.sigh.designpatterns.structural.flyweight.basic.Flyweight;

public class UnsharedConcreteFlyweight implements Flyweight {

    private String allState;
    @Override public void operation(String extrinsicStat) {
        System.out.println("UnsharedConcreteFlyweight.operation");
    }
}
