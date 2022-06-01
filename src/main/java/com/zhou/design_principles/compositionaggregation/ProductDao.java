package com.zhou.design_principles.compositionaggregation;

/**
 * @author zhouxufeng
 * @date 2022/4/28 10:06
 */
public class ProductDao {
    private DBConnetction dbConnetction;

    public void setDbConnetction(DBConnetction dbConnetction) {
        this.dbConnetction = dbConnetction;
    }

    public void addProduct() {
        String con = dbConnetction.getConnection();
        System.out.println("使用" + con + "增加产品");
    }
}
