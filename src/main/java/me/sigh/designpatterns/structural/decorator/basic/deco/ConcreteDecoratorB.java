package me.sigh.designpatterns.structural.decorator.basic.deco;

import me.sigh.designpatterns.structural.decorator.basic.Component;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override public void operation() {
        addedBehavior();
        super.operation();
    }

    public void addedBehavior(){
        System.out.println("ConcreteDecoratorB.addedBehavior");
    }
}
