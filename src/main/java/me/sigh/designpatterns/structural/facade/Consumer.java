package me.sigh.designpatterns.structural.facade;

public class Consumer {


    public static void main(String[] args) {

        SimpleFacade facade = new SimpleFacade();

        facade.provide();
    }
}
