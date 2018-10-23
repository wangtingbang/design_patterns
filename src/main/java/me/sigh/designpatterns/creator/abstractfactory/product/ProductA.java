package me.sigh.designpatterns.creator.abstractfactory.product;

import me.sigh.designpatterns.creator.abstractfactory.Product;

public class ProductA implements Product {
    private String label;

    public ProductA() {
    }

    public ProductA(String label) {
        this.label = label;
    }

    @Override public void use() {
        System.out.println("use productA");
    }

    @Override public void destroy() {

        System.out.println("destroy productA");
    }

    @Override public void label() {
        System.out.println("label of productA: " + label);
    }
}
