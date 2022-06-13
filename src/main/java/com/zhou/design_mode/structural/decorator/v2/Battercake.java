package com.zhou.design_mode.structural.decorator.v2;

public class Battercake extends ABattercake{
    protected String getDesc() {
        return "煎饼";
    }

    protected int cost() {
        return 8;
    }
}
