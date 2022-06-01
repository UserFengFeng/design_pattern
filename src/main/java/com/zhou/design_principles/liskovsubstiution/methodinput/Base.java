package com.zhou.design_principles.liskovsubstiution.methodinput;

import java.util.HashMap;

/**
 * @author zhouxufeng
 * @date 2022/4/15 13:46
 */
public class Base {
    public void method(HashMap map) {
        System.out.println("父类被执行");
    }
}
