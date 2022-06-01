package com.zhou.design_mode.creational.singleton;

import java.io.Serializable;

/**
 * TODO 饿汉式
 *  @author zhouxufeng
 * @date 2022/5/12 10:55
 *
 */
public class HungrySingleton implements Serializable {
    // private final static HungrySingleton hungrySingleton = new HungrySingleton();
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    // TODO 解決实例化与反实例化导致的对象不是同一个
    private Object readResolve() {
        return hungrySingleton;
    }

}
