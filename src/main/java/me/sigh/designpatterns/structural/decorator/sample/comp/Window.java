package me.sigh.designpatterns.structural.decorator.sample.comp;


import me.sigh.designpatterns.structural.decorator.sample.Component;

public class Window extends Component {
    @Override public void display() {
        System.out.println("Window.display");
    }
}
