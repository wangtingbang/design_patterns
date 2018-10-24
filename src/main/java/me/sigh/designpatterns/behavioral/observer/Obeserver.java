package me.sigh.designpatterns.behavioral.observer;

public interface Obeserver {

    void update(String state);

    boolean isNamed(String name);

    String getName();
}
