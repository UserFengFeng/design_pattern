package com.zhou.design_mode.structural.facade;

/**
 * 定义：又叫门面模式，提供一个统一的接口，用来访问子系统中的一群接口
 *      外观模式定义了一个高层接口，让子系统更容易使用
 * 类型：结构型
 * 使用场景：子系统越来越复杂，增加外观模式提供简单调用接口
 *         构建多层系统结构，利用外观对象作为每层的入口，简化层间调用
 * 相关设计模式：外观模式+中介者模式
 *            外观模式+单例模式
 *            外观模式+抽象工厂模式
 * 优点：简化了调用过程，无需了解深入子系统，防止带来风险
 *      减少系统依赖，松散耦合
 *      更好的划分访问层次
 *      符合迪米特法则，即最少知道原则
 * 缺点：增加子系统、扩展子系统行为容易引入风险
 *      不符合开闭原则
 *
 * 应用层之和外观类做交互，不和具体子系统进行交互
 * 白话文理解：看似调用的GiftExchangeServer这个类的方法  其实里面调用的是其他类的方法
 * */
public class Test {
    public static void main(String[] args) {
        PointsGift t = new PointsGift("T");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        // giftExchangeService.setQualifyService(new QualifyService());
        // giftExchangeService.setShippingService(new ShippingService());
        // giftExchangeService.setPointsPaymentService(new PointsPaymentService());
        giftExchangeService.giftExchange(t);
    }
}
