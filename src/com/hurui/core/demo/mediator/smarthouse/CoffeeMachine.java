package com.hurui.core.demo.mediator.smarthouse;

public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name){
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void startCoffee(){
        System.out.println("Im am coffeeMachine");
    }

    public void finishCoffee(){
        System.out.println("coffeeMachine is time to stop");
        SendMessage(0);
    }
}
