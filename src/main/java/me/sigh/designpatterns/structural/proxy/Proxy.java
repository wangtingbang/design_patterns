package me.sigh.designpatterns.structural.proxy;

public class Proxy implements Subject {

    private RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    public void preRequest() {
        System.out.println("proxy.preRequest");
    }

    @Override public void request(String arg) {

        preRequest();
        realSubject.request(arg);
        afterRequest();
    }

    public void afterRequest() {
        System.out.println("proxy.afterRequest");
    }
}
