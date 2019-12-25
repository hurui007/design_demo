package com.hurui.core.demo.strategy;

import com.hurui.core.demo.strategy.entity.Duck;
import com.hurui.core.demo.strategy.entity.PekingDuck;
import com.hurui.core.demo.strategy.entity.WildDuck;
import com.hurui.core.demo.strategy.hehavior.BadFlyBehavior;

public class MainTest {

    public static void main(String[] args) {
        Duck peking = new PekingDuck();
        peking.fly();

        //----    可以动态改变属性    ----
        peking.setFlyBehavior(new BadFlyBehavior());
        peking.fly();
        Duck wildDuck = new WildDuck();
        wildDuck.fly();
    }
}
