package me.sigh.designpatterns.creator.factorymethod.impl;

import me.sigh.designpatterns.creator.factorymethod.Factory;
import me.sigh.designpatterns.creator.factorymethod.Product;

public class ConcreteFactory implements Factory {
    @Override public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
