package me.sigh.designpatterns.creational.factorymethod.impl;

import me.sigh.designpatterns.creational.factorymethod.Product;

public class ConcreteProduct implements Product {
    @Override public void use() {
        System.out.println("use: " + ConcreteProduct.class.getName());
    }
}
