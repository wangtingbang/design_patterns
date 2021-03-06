package me.sigh.designpatterns.structural.bridge.deprecated;

public abstract class Pen {

    protected Color color;

    protected abstract void setColor(Color color);

    protected abstract void draw();
}
