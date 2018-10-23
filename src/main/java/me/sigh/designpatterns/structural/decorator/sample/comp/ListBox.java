package me.sigh.designpatterns.structural.decorator.sample.comp;


import me.sigh.designpatterns.structural.decorator.sample.Component;

public class ListBox extends Component {
    @Override public void display() {

        System.out.println("ListBox.display");
    }
}
