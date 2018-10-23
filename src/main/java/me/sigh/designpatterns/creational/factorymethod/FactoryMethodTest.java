package me.sigh.designpatterns.creational.factorymethod;

import me.sigh.designpatterns.creational.factorymethod.impl.ConcreteFactory;

public class FactoryMethodTest {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();

        Product product = factory.factoryMethod();

        product.use();
    }
}
