package me.sigh.designpatterns.creator.abstractfactory.factory;

import me.sigh.designpatterns.creator.abstractfactory.AbstractFactory;
import me.sigh.designpatterns.creator.abstractfactory.Product;

public class FirstFactory implements AbstractFactory {
    @Override public Product createProductA() {
        return null;
    }

    @Override public Product createProductB() {
        return null;
    }
}
