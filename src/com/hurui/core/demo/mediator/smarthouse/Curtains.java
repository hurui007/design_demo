package com.hurui.core.demo.mediator.smarthouse;

public class Curtains extends Colleague {

    public Curtains(Mediator mediator, String name){
        super(mediator, name);
        //在创建Alarm同事对象时，将自己放入到ConcreteMediator对象集合中【集合】
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {

        this.getMediator().getMessage(stateChange, this.name);

    }

    public void upCurtains(){
        System.out.println("I am holding up curtains");
    }
}
