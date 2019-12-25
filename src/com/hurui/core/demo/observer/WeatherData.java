package com.hurui.core.demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 类是核心
 * 1、包含最新的天气情况信息
 * 2、含有观察者集合，使用集合挂你
 * 3、当数据有更新时，就主动调用，list，通知所有的接入方，就看到了最新消息
 */
public class WeatherData implements Subject {

    private float temperature;

    private float pressure;

    private float humidity;

    //观察者集合
    private List<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<>();
    }


    /**
     * 注册一个观察者
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除一个观察者
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 遍历一个观察者，并通知
     */
    @Override
    public void notifyObserver() {
        observers.forEach(list -> {
            list.update(this.temperature,this.pressure,this.humidity);
        });
    }


    public void dataChange(){
        this.notifyObserver();
    }

    /**
     * 当有数据更新时，就调用setData
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dataChange();
    }


    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }




}
