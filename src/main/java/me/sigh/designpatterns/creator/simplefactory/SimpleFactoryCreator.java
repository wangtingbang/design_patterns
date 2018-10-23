package me.sigh.designpatterns.creator.simplefactory;

import me.sigh.designpatterns.creator.simplefactory.impl.ProductA;
import me.sigh.designpatterns.creator.simplefactory.impl.ProductB;

public class SimpleFactoryCreator {

    public static Product getInstance(String serviceName){

        if(ProductA.class.getSimpleName().equals(serviceName)){
            return new ProductA();
        }

        if(ProductB.class.getSimpleName().equals(serviceName)){
            return new ProductB();
        }

        return null;
    }

    public static void main(String[] args) {
        Product product = SimpleFactoryCreator.getInstance("ProductA");

        System.out.println(product.getName());
    }
}
