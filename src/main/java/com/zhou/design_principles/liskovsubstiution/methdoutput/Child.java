package com.zhou.design_principles.liskovsubstiution.methdoutput;

import java.util.HashMap;

/**
 * @author zhouxufeng
 * @date 2022/4/15 14:59
 */
public class Child extends Base{
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        hashMap.put("aa", "子类被执行");
        return hashMap;
    }
}
