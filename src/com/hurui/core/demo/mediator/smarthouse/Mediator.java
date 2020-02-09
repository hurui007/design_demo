package com.hurui.core.demo.mediator.smarthouse;

public abstract class Mediator {

    //将一个 中介中对象，加入到集合中
    public abstract void Register(String colleagueName, Colleague colleague);

    //接受消息，具体的同事对象发出的
    public abstract void getMessage(int stateChange, String colleaagueName);

    public abstract void sendMessage();
}
