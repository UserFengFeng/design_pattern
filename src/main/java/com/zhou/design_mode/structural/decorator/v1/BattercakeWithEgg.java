package com.zhou.design_mode.structural.decorator.v1;

public class BattercakeWithEgg extends Battercake{
    @Override
    public String getDesc() {
        return super.getDesc() + "加一个蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
