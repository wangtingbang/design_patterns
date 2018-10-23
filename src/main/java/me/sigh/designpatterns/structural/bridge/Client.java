package me.sigh.designpatterns.structural.bridge;

public class Client {


    public static Object getBean(String name) {
        try {
            Class clz = Class.forName(name);
            return clz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {

        String imgName = "me.sigh.designpatterns.structural.bridge.images.JPGImage";
        String implName = "me.sigh.designpatterns.structural.bridge.comp.WindowsImpl";
        String fileName = "test.file";
        Image image = (Image)getBean(imgName);
        ImageImpl impl = (ImageImpl)getBean(implName);

        image.setImageImpl(impl);
        image.parseFile(fileName);

    }
}
