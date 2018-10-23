package me.sigh.designpatterns.creational.factorymethod.impl;

import me.sigh.designpatterns.creational.factorymethod.Factory;
import me.sigh.designpatterns.creational.factorymethod.Product;

public class ConcreteFactory implements Factory {
    @Override public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
