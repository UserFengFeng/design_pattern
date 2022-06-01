package com.zhou.design_principles.compositionaggregation;

/**
 *  todo 合成复用原则
 * @author zhouxufeng
 * @date 2022/4/28 10:08
 */
public class Test {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnetction(new MySqlConnection());
        productDao.addProduct();
    }
}
