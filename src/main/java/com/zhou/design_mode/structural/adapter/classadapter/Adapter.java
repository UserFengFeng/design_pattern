package com.zhou.design_mode.structural.adapter.classadapter;

public class Adapter extends Adaptee implements Target{
    public void request() {
        // ...
        super.adapteeRequest();
        // ...
    }
}
