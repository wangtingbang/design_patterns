package me.sigh.designpatterns.structural.adapter.service.impl;

public class Adaptee {
    public void specificRequest(String argv) {
        System.out.println("Adaptee.specificRequest received request: " + argv);
    }
}
