package com.zhou.design_mode.structural.adapter.objectadapter;

/*
* todo 对象实现
* */
public class Test {
    public static void main(String[] args) {
        ConcreteTarget concreteTarget = new ConcreteTarget();
        concreteTarget.request();
        Adapter adapter = new Adapter();
        adapter.request();
    }
}
