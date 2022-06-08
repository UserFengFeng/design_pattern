package com.zhou.design_mode.creational.singleton;

import com.github.pagehelper.StringUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例容器
 *
 * */
public class ContainerSingleton {
    public ContainerSingleton() {
    }

    private static Map<String, Object> singletonMap = new HashMap<String, Object>();

    public static void putInstance(String key, Object instance) {
        if(StringUtil.isNotEmpty(key) && instance!= null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
