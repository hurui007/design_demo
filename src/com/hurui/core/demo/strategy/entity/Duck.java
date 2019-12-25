package com.hurui.core.demo.strategy.entity;

import com.hurui.core.demo.strategy.hehavior.FlyBehavior;

public abstract class Duck {

    public Duck(){}

    //应该聚合策略接口,其他属性也是可以和策略关联
    FlyBehavior flyBehavior;

    public abstract void display();

    public void fly(){
        if(null != flyBehavior){
            flyBehavior.fly();
        }
    }

    //可以用于动态改变属性
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
}
