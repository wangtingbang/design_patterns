package me.sigh.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Subject {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    List<Obeserver> obeservers = new ArrayList<>();

    public void attach(Obeserver obeserver) {
        obeservers.add(obeserver);
    }

    public void detach(String name) {
        obeservers = obeservers.stream().filter(t -> !t.isNamed(name)).collect(Collectors.toList());
    }

    public void notice() {
        for (Obeserver obeserver : obeservers) {
            obeserver.update(this.state);
        }
    }
}
