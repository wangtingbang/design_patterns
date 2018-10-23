package me.sigh.designpatterns.creational.abstractfactory.factory;

import me.sigh.designpatterns.creational.abstractfactory.AbstractFactory;
import me.sigh.designpatterns.creational.abstractfactory.Product;

public class SecondFactory implements AbstractFactory {
    @Override public Product createProductA() {
        return null;
    }

    @Override public Product createProductB() {
        return null;
    }
}
