package com.hurui.core.demo.adapter.classadapter;

/**
 * 为什么要继承 Voltage220V 这个类？
 * 因为 重写方法中 需要调用src类的方法
 * 也可以重写Voltage220V 的方法
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    /**
     * @title 220V转为5伏电压
     * @return
     */
    @Override
    public int ouput5V() {
        // 先获取到220v电压，原来的属性
        int srcV = output220V();
        int dstV = srcV/44;
        return dstV;
    }
}
