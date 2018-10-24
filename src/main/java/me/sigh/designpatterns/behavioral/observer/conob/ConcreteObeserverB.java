package me.sigh.designpatterns.behavioral.observer.conob;

import me.sigh.designpatterns.behavioral.observer.Obeserver;

public class ConcreteObeserverB implements Obeserver {

    private String name;
    private String state;

    public ConcreteObeserverB(String name) {
        this.name = name;
    }

    @Override public void update(String state) {
        System.out.println("ConcreteObeserverB( " + name + " ).update state from " + this.state + " to " + state);
        this.state = state;
    }

    @Override public boolean isNamed(String name) {
        return this.name.equals(name);
    }

    @Override public String getName() {
        return this.name;
    }
}
