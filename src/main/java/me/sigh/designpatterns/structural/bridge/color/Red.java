package me.sigh.designpatterns.structural.bridge.color;

import me.sigh.designpatterns.structural.bridge.Color;

public class Red implements Color {
    String color;

    @Override public void setColor() {
        this.color = "red";
    }

    @Override public String toString() {
        return color;
    }
}
