package me.sigh.designpatterns.behavioral.command;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call() {

        System.out.println("Invoker.call");
        command.execute();
    }
}
