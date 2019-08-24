package com.hurui.core.demo.adapter.objectadapter;

public class Client {

    public static void main(String[] args) {
        System.out.println("对象适配器模式");
        Phone phone = new Phone();
        // VoltageAdapter 适配器
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
