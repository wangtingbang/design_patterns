package me.sigh.designpatterns.structural.decorator.sample.comp;


import me.sigh.designpatterns.structural.decorator.sample.Component;

public class TextBox extends Component {
    @Override public void display() {
        System.out.println("TextBox.display");
    }
}
