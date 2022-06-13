package com.zhou.design_mode.structural.decorator.v1;

public class BattercakeWithEggSausage extends BattercakeWithEgg{
    @Override
    public String getDesc() {
        return super.getDesc() + "加一根肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
