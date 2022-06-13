package com.zhou.design_mode.structural.decorator.v2;

public abstract class AbstractDecoator extends ABattercake {
    private ABattercake aBattercake;

    public AbstractDecoator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
