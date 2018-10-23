package me.sigh.designpatterns.structural.bridge.impl;

import me.sigh.designpatterns.structural.bridge.ImageImpl;
import me.sigh.designpatterns.structural.bridge.Matrix;

public class LinuxImpl implements ImageImpl {
    @Override public void doPaint(Matrix matrix) {

        System.out.println("在 Linux 中显示图像");
    }
}
