package me.sigh.designpatterns.creator.factorymethod;

import me.sigh.designpatterns.creator.factorymethod.impl.ConcreteFactory;

public class FactoryMethodTest {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();

        Product product = factory.factoryMethod();

        product.use();
    }
}
