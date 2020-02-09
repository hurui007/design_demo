package com.hurui.core.demo.mediator.smarthouse;

/**
 * 具体的同事类
 */
public class Alarm extends Colleague {

    /**
     * 构造方法
     * @param mediator
     * @param name
     */
    public Alarm(Mediator mediator, String name){
        super(mediator, name);
        //在创建Alarm同事对象时，将自己放入到ConcreteMediator对象集合中【集合】
        mediator.Register(name, this);
    }

    public void sendAlarm(int stateChange){
        SendMessage(stateChange);
    }

    @Override
    public void SendMessage(int stateChange) {
        // 调用中介者对象的getMessage方法
        this.getMediator().getMessage(stateChange, this.name);
    }



}
