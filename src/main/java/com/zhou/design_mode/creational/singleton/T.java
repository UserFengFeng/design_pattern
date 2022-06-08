package com.zhou.design_mode.creational.singleton;

import sun.awt.image.PixelConverter;

import static sun.awt.image.PixelConverter.Argb.instance;

/**
 * @author zhouxufeng
 * @date 2022/5/10 8:54
 */
public class T implements Runnable{
    public void run() {
        // LazySingleton instance = LazySingleton.getInstance();
        // StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        // System.out.println(Thread.currentThread().getName() + PixelConverter.Argb.instance);

        ContainerSingleton.putInstance("object", new Object());
        Object object = ContainerSingleton.getInstance("object");
        System.out.println(object);
    }
}
