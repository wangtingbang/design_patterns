package me.sigh.designpatterns.structural.bridge.impl;

import me.sigh.designpatterns.structural.bridge.ImageImpl;
import me.sigh.designpatterns.structural.bridge.Matrix;

public class WindowsImpl implements ImageImpl {
    @Override public void doPaint(Matrix matrix) {
        System.out.println("在 Windows 中显示图像");
    }
}
