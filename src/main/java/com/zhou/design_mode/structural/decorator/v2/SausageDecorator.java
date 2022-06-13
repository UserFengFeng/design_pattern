package com.zhou.design_mode.structural.decorator.v2;

public class SausageDecorator extends AbstractDecoator{

    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
