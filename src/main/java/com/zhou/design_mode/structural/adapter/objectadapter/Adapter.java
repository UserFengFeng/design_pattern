package com.zhou.design_mode.structural.adapter.objectadapter;

public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    public void request() {
        adaptee.adapteeRequest();
    }
}
