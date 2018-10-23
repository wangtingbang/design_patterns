package me.sigh.designpatterns.structural.facade;

import me.sigh.designpatterns.structural.facade.provider.ProviderA;
import me.sigh.designpatterns.structural.facade.provider.ProviderB;
import me.sigh.designpatterns.structural.facade.provider.ProviderC;

public class SimpleFacade {

    private ProviderA providerA;
    private ProviderB providerB;
    private ProviderC providerC;

    public SimpleFacade() {
        providerA = new ProviderA();
        providerB = new ProviderB();
        providerC = new ProviderC();
    }

    public void provide(){

        providerA.provide();
        providerB.provide();
        providerC.provide();
    }
}
