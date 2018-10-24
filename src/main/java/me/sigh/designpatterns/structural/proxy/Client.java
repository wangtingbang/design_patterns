package me.sigh.designpatterns.structural.proxy;

public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();

        proxy.request("request from client");
    }

}
