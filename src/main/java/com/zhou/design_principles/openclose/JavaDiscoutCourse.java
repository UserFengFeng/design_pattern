package com.zhou.design_principles.openclose;

/**
 * @author zhouxufeng
 * @date 2022/4/13 9:56
 */
public class JavaDiscoutCourse extends JavaCourse {
    public JavaDiscoutCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
