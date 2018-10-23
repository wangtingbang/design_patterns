package me.sigh.designpatterns.structural.decorator.sample.deco;

import me.sigh.designpatterns.structural.decorator.sample.Component;

public class ScrollBarDecorator extends ComponentDecorator{

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override public void display() {

        this.setScrollBar();
        super.display();
    }

    public void setScrollBar(){
        System.out.println("ScrollBarDecorator.setScrollBar");
    }
}
