package me.sigh.designpatterns.structural.flyweight.basic.impl;

import me.sigh.designpatterns.structural.flyweight.basic.Flyweight;

public class ConcreteFlyweight implements Flyweight {

    private String intrinsicState;

    @Override public void operation(String extrinsicStat) {
        System.out.println("ConcreteFlyweight.operation");
    }
}
