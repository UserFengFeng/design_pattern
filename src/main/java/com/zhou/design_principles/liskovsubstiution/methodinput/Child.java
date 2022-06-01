package com.zhou.design_principles.liskovsubstiution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouxufeng
 * @date 2022/4/15 13:47
 */
public class Child extends Base {
    @Override
    public void method(HashMap map) {
        super.method(map);
    }

    // 进行重载
    public void method(Map map) {
        System.out.println("子类被执行");
    }
}
