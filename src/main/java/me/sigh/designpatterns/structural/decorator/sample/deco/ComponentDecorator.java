package me.sigh.designpatterns.structural.decorator.sample.deco;

import me.sigh.designpatterns.structural.decorator.sample.Component;

public abstract class ComponentDecorator extends Component {

    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    public void display() {
        component.display();
    }

}
