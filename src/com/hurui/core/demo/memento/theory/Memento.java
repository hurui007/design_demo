package com.hurui.core.demo.memento.theory;

public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

    private void setState(String state){
        this.state = state;
    }
}
