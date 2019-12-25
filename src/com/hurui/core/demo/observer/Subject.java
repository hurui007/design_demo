package com.hurui.core.demo.observer;
//这个接口，让weatherData来实现
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
