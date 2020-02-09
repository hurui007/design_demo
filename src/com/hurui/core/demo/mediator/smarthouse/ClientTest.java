package com.hurui.core.demo.mediator.smarthouse;

import javax.swing.plaf.metal.MetalDesktopIconUI;

public class ClientTest {

    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建闹钟
        Alarm alarm = new Alarm(mediator, "alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tv = new TV(mediator, "TV");

        //让闹钟发出消息
        alarm.sendAlarm(0);

        coffeeMachine.finishCoffee();
        alarm.sendAlarm(1);
    }
}
