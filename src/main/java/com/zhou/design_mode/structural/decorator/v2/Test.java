package com.zhou.design_mode.structural.decorator.v2;

public class Test {
    public static void main(String[] args) {
        /*
            todo
        *   场景：问老板买个煎饼果子,加一个鸡蛋，加一个香肠，具体需要多少钱？
        *
        * */
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + "价格：" + aBattercake.cost());
    }
}
