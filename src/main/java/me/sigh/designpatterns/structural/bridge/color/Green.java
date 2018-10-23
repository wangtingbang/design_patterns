package me.sigh.designpatterns.structural.bridge.color;

import me.sigh.designpatterns.structural.bridge.Color;

public class Green implements Color {
    String color;

    @Override public void setColor() {
        this.color = "green";
    }

    @Override public String toString() {
        return color;
    }
}
