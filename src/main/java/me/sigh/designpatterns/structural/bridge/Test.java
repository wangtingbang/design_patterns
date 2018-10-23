package me.sigh.designpatterns.structural.bridge;

import me.sigh.designpatterns.structural.bridge.color.Green;
import me.sigh.designpatterns.structural.bridge.color.Red;
import me.sigh.designpatterns.structural.bridge.pen.BrushPen;
import me.sigh.designpatterns.structural.bridge.pen.FountainPen;

public class Test {
    public static void main(String[] args) {
        Pen pen = new BrushPen();
        Color color = new Green();
        color.setColor();
        pen.setColor(color);
        pen.draw();

        color = new Red();
        color.setColor();
        pen.setColor(color);
        pen.draw();

        pen = new FountainPen();
        pen.setColor(color);
        pen.draw();
    }
}
