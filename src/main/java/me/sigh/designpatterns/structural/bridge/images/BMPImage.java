package me.sigh.designpatterns.structural.bridge.images;

import me.sigh.designpatterns.structural.bridge.Image;
import me.sigh.designpatterns.structural.bridge.Matrix;

public class BMPImage extends Image {

    @Override public void parseFile(String fileName) {

        Matrix matrix = new Matrix();
        imageImpl.doPaint(matrix);

        System.out.println(fileName + " 格式为BMP");
    }
}
