package com.hurui.core.demo.observer;

public class CurrentConditions implements Observer {

    private float temperature;

    private float pressure;

    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }


    public void display(){
        System.out.println(" CurrentConditions temperature:" + temperature);
        System.out.println(" CurrentConditions pressure:" + pressure);
        System.out.println(" CurrentConditions humidity:" + humidity);
    }

}
