package com.hurui.core.demo.adapter.objectadapter;

public class Phone {

    /**
     * @title 充电的方法
     */
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.ouput5V() == 5){
            System.out.println("电压5v，可以充电");
        }
        else if(iVoltage5V.ouput5V() > 5){
            System.out.println("电压大于5伏，不能充电");
        }
    }
}
