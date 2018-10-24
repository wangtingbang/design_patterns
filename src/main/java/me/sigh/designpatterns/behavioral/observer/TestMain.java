package me.sigh.designpatterns.behavioral.observer;

import me.sigh.designpatterns.behavioral.observer.conob.ConcreteObeserverA;
import me.sigh.designpatterns.behavioral.observer.conob.ConcreteObeserverB;
import me.sigh.designpatterns.behavioral.observer.conob.ConcreteObeserverC;
import me.sigh.designpatterns.behavioral.observer.consub.ConcreteSubject;


public class TestMain {

    public static void main(String[] args) {
        Subject subject0 = new ConcreteSubject();
        Obeserver obeserverA0 = new ConcreteObeserverA("obeserver0_A");
        Obeserver obeserverA1 = new ConcreteObeserverA("obeserver1_A");
        Obeserver obeserverA2 = new ConcreteObeserverA("obeserver2_A");
        Obeserver obeserverA3 = new ConcreteObeserverA("obeserver3_A");
        Obeserver obeserverB0 = new ConcreteObeserverB("obeserver0_B");
        Obeserver obeserverC0 = new ConcreteObeserverC("obeserver0_C");
        subject0.attach(obeserverA0);
        subject0.attach(obeserverA1);
        subject0.attach(obeserverA2);
        subject0.attach(obeserverA3);
        subject0.attach(obeserverB0);
        subject0.attach(obeserverC0);

        subject0.setState("init");
        subject0.notice();

        subject0.detach(obeserverA0.getName());
        subject0.detach(obeserverA1.getName());
        subject0.detach(obeserverA2.getName());

        System.out.println();

        subject0.setState("start");
        subject0.notice();

    }
}
