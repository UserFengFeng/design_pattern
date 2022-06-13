package com.zhou.design_mode.structural.decorator.v1;

public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + "价格：" + battercake.cost());

        // 加一个鸡蛋
        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() + "价格:" + battercakeWithEgg.cost());

        // 加一个鸡蛋+一个肠
        BattercakeWithEggSausage battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc() + "价格:" + battercakeWithEggSausage.cost());

    }
}
