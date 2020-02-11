package com.hurui.core.demo.memento.theory;

public class Originator {

    private String state;

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state = state;
    }

    //保存状态对象
    public Memento saveStateMemento(){
        return new Memento(state);
    }

    //从备忘录恢复对象状态
    public void getStateMemento(Memento memento){
        state = memento.getState();
    }
}
