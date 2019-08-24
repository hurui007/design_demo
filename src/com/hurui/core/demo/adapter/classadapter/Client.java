package com.hurui.core.demo.adapter.classadapter;

public class Client {

    public static void main(String[] args) {
        System.out.println("类适配器模式");
        Phone phone = new Phone();
        // VoltageAdapter 适配器
        phone.charging(new VoltageAdapter());
    }
}
