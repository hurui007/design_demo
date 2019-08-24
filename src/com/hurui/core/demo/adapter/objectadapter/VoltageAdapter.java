package com.hurui.core.demo.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    /**
     * @title 通过构造器，传入一个Voltage220V 通过关联聚合
     * @param voltage220V
     */
    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    /**
     * @title 220V转为5伏电压
     * @return
     */
    @Override
    public int ouput5V() {
        int dstV = 0;
        if(voltage220V != null){
            // 先获取到220v电压，原来的属性
            int srcV = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配");
            dstV = srcV/44;
            System.out.println("适配完成，输出的电压为：" + dstV);
        }
        return dstV;
    }
}
