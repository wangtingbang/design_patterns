package me.sigh.designpatterns.structural.decorator.basic.deco;

import me.sigh.designpatterns.structural.decorator.basic.Component;

public class Decorator extends Component {

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override public void operation() {
        component.operation();
    }
}
