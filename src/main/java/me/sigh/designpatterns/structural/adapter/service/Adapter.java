package me.sigh.designpatterns.structural.adapter.service;

import me.sigh.designpatterns.structural.adapter.service.impl.Adaptee;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request(String argv) {

        System.out.println("Adapter.request received request: " + argv);
        System.out.println("Adapter start adapt to Adaptee");
        adaptee.specificRequest(argv);
    }
}
