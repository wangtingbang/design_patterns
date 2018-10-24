package me.sigh.designpatterns.behavioral.observer.conob;

import me.sigh.designpatterns.behavioral.observer.Obeserver;

public class ConcreteObeserverC implements Obeserver {

    private String name;
    private String state;

    public ConcreteObeserverC(String name) {
        this.name = name;
    }

    @Override public void update(String state) {
        System.out.println("ConcreteObeserverC( " + name + " ).update state from " + this.state + " to " + state);
        this.state = state;
    }

    @Override public boolean isNamed(String name) {
        return this.name.equals(name);
    }

    @Override public String getName() {
        return this.name;
    }
}
