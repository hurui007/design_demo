package com.hurui.core.demo.strategy.entity;

import com.hurui.core.demo.strategy.hehavior.GoodFlyBehavior;

public class WildDuck extends Duck {


    //构造器，传入FlyBehavior的兑现
    public WildDuck(){
        flyBehavior = new GoodFlyBehavior();
    }


    @Override
    public void display() {
        System.out.println("这是野鸭");
    }


}
