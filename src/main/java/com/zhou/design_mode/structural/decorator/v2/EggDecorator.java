package com.zhou.design_mode.structural.decorator.v2;

public class EggDecorator extends AbstractDecoator {

    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    protected void doSomething() {
        /*
        * todo 如果作为抽象的装饰者，能保证子类，必须实现某个方法的话，那么这个方法才有意义 具体如何使用还得看具体场景
        *  比如 老板在做煎饼的时候 要加个鸡蛋  需要做出某些动作 比如打鸡蛋等等的特定的小动作，分别属于各自的装饰者实现
        *      这个时候对于两个实体的装饰者的父类，用抽象的装饰者，才有意义
        *  没有硬规定，实体装饰者的父类是否为抽象形式  具体使用还得看具体场景
        * */
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
