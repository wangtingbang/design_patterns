package me.sigh.designpatterns.creator.simplefactory.impl;

import me.sigh.designpatterns.creator.simplefactory.Product;

public class ProductA implements Product {
    @Override public String getName() {
        return "productA";
    }
}
