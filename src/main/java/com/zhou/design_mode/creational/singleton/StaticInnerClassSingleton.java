package com.zhou.design_mode.creational.singleton;

/**
 * 懒汉式
 * @author zhouxufeng
 * @date 2022/5/12 9:23
 */
public class StaticInnerClassSingleton {
    private static class InnerClass{
       private static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.singleton;
    }

    private StaticInnerClassSingleton() {
        if(InnerClass.singleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
}
