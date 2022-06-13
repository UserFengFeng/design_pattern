package com.zhou.design_mode.structural.adapter;

public class PowerAdapter implements DC5{
    private AC220 ac220 = new AC220();

    public int ouputDC5() {
        int adapterInput = ac220.outputAC220V();

        // 变压器逻辑
        int adapterOutput = adapterInput / 44;

        System.out.println("使用PowerAdapter输入ac" + adapterOutput + "v");
        System.out.println("输出DC:" + adapterOutput + "v 直流电");
        return adapterOutput;
    }
}
