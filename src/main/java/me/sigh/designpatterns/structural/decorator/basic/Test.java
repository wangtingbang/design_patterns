package me.sigh.designpatterns.structural.decorator.basic;

import me.sigh.designpatterns.structural.decorator.basic.comp.ConcreteComponent;
import me.sigh.designpatterns.structural.decorator.basic.deco.ConcreteDecoratorB;

public class Test {

    public static void main(String[] args) {
        Component component, componentB;

        component = new ConcreteComponent();
        componentB = new ConcreteDecoratorB(component);

        componentB.operation();
    }
}
