package com.zhou.design_principles.compositionaggregation;

/**
 * @author zhouxufeng
 * @date 2022/4/28 10:11
 */
public class MySqlConnection extends DBConnetction{

    @Override
    public String getConnection() {
        return "mysql数据库链接";
    }
}
