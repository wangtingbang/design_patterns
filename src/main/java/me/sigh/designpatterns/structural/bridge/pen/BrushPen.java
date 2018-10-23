package me.sigh.designpatterns.structural.bridge.pen;

import me.sigh.designpatterns.structural.bridge.Color;
import me.sigh.designpatterns.structural.bridge.Pen;

public class BrushPen extends Pen {
    @Override protected void setColor(Color color) {
        this.color = color;
    }

    @Override protected void draw() {

        System.out.println("Brush pen draw with color: " + color.toString());
    }
}
