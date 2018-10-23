package me.sigh.designpatterns.structural.decorator.sample;

import me.sigh.designpatterns.structural.decorator.sample.comp.Window;
import me.sigh.designpatterns.structural.decorator.sample.deco.BlackBorderDecorator;
import me.sigh.designpatterns.structural.decorator.sample.deco.ScrollBarDecorator;

public class Test {

    public static void main(String[] args) {

        Component windowComp, scrollBarDecoComp, blackBoderDecoComp;

        windowComp = new Window();
        scrollBarDecoComp = new ScrollBarDecorator(windowComp);

        scrollBarDecoComp.display();

        blackBoderDecoComp = new BlackBorderDecorator(scrollBarDecoComp);

        blackBoderDecoComp.display();

    }
}
