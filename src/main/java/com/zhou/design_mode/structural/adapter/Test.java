package com.zhou.design_mode.structural.adapter;

/**
 * todo  适配器模式
 * 定义：将一个类的接口转换成客户期望的另一个接口，使原本接口不兼容的类可以一起工作
 * 类型：结构型
 * 场景：已经存在的类，它的方法和需求不匹配时（方法结果或相似）
 *      不是软件设计阶段考虑的设计模式，是随着软件维护，由于不同产品、不同厂家造成的类似的接口不相同情况下的解决方案
 * 优点：能提高类的透明性和复用，现有的类复用但不许要改变
 *      目标类和适配器类解耦，提高程序扩展性
 *      符合开闭原则
 * 缺点：适配器编写过程需要全面考虑，可能会增加系统的复杂性
 *      增加系统代码可读的难度
 *
 * 如下场景：买手机都带一个充电头，要将220v的交流电转成5v的直流电
 * */
public class Test {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter();
        powerAdapter.ouputDC5();
    }
}
