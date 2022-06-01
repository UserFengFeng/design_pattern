package com.zhou.design_principles.compositionaggregation;

/**
 * @author zhouxufeng
 * @date 2022/4/28 10:05
 */
public abstract class DBConnetction {
    // public String getConnection() {
    //     return "mysql数据Ku连接";
    // }

    public abstract String getConnection();
}
