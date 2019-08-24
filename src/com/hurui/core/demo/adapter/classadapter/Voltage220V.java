package com.hurui.core.demo.adapter.classadapter;

/**
 * @title 被适配的类
 */
public class Voltage220V {

    /**
     * @title 输出220伏电压
     * @return
     */
    public int output220V(){
        int src = 220;
        System.out.println("电压：" + src + "伏");
        return src;
    }
}
