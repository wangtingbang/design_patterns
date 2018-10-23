package me.sigh.designpatterns.structural.decorator.sample.deco;

import me.sigh.designpatterns.structural.decorator.sample.Component;

public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder(){

        System.out.println("BlackBorderDecorator.setBlackBorder");
    }
}
