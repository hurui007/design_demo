package com.hurui.core.demo.strategy.hehavior;

public class BadFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("飞翔技术不好");
    }
}
