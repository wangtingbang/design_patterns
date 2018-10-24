package me.sigh.designpatterns.structural.proxy;

public class RealSubject implements Subject{
    @Override public void request(String arg) {
        System.out.println("RealSubject.request received: " + arg);
    }
}
