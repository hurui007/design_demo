package com.hurui.core.demo.strategy.entity;

import com.hurui.core.demo.strategy.hehavior.NoFlyBehavior;

public class PekingDuck extends Duck {

    public PekingDuck(){
        flyBehavior = new NoFlyBehavior();
    }


    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }
}
