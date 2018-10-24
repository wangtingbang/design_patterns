package me.sigh.designpatterns.structural.adapter;

import me.sigh.designpatterns.structural.adapter.service.Adapter;
import me.sigh.designpatterns.structural.adapter.service.Target;
import me.sigh.designpatterns.structural.adapter.service.impl.Adaptee;

public class Client {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);

        target.request("A request from client");
    }
}
