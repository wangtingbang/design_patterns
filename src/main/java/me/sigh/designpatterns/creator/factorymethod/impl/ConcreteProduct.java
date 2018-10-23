package me.sigh.designpatterns.creator.factorymethod.impl;

import me.sigh.designpatterns.creator.factorymethod.Product;

public class ConcreteProduct implements Product {
    @Override public void use() {
        System.out.println("use: " + ConcreteProduct.class.getName());
    }
}
