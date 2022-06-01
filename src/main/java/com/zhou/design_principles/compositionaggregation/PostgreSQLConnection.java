package com.zhou.design_principles.compositionaggregation;

/**
 * @author zhouxufeng
 * @date 2022/4/28 10:28
 */
public class PostgreSQLConnection extends DBConnetction{
    @Override
    public String getConnection() {
        return "postgre数据库连接";
    }
}
