package com.hurui.core.demo.mediator.smarthouse;

public class TV extends Colleague {

    public TV(Mediator mediator, String name){
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void startTv(){
        System.out.println("it is time to startTv");
    }

    public void stopTv(){
        System.out.println("it is time to stop tv");
    }
}
