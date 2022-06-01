package com.zhou.design_mode.creational.singleton;

/**
 *  * 懒汉式
 * @author zhouxufeng
 * @date 2022/5/10 8:43
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public synchronized static LazySingleton getInstance() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
