package me.sigh.designpatterns.structural.decorator.basic.comp;

import me.sigh.designpatterns.structural.decorator.basic.Component;

public class ConcreteComponent extends Component {
    @Override public void operation() {

        System.out.println("ConcreteComponent.operation");
    }
}
