package com.zhou.design_mode.structural.adapter.objectadapter;

public class ConcreteTarget implements Target {
    public void request() {
        System.out.printf("concretetarget 目标方法");
    }
}
