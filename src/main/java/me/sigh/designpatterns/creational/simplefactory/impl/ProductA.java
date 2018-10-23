package me.sigh.designpatterns.creational.simplefactory.impl;

import me.sigh.designpatterns.creational.simplefactory.Product;

public class ProductA implements Product {
    @Override public String getName() {
        return "productA";
    }
}
