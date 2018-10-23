package me.sigh.designpatterns.creator.abstractfactory.product;

import me.sigh.designpatterns.creator.abstractfactory.Product;

public class ProductB implements Product {
    private String label;

    public ProductB() {
    }

    public ProductB(String label) {
        this.label = label;
    }

    @Override public void use() {
        System.out.println("use productB");
    }

    @Override public void destroy() {

        System.out.println("destroy productB");
    }

    @Override public void label() {
        System.out.println("label of productB: " + label);
    }
}
