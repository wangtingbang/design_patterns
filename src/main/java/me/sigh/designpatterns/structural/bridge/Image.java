package me.sigh.designpatterns.structural.bridge;

public abstract class Image {

    protected ImageImpl imageImpl;

    public void setImageImpl(ImageImpl imageImpl) {
        this.imageImpl = imageImpl;
    }

    public abstract void parseFile(String fileName);
}
