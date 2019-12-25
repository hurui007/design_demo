package com.hurui.core.demo.observer;

public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        weatherData.registerObserver(currentConditions);

        weatherData.setData(12f,13f,14f);

    }
}
