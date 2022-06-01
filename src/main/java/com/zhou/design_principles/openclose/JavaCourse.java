package com.zhou.design_principles.openclose;

/**
 * @author zhouxufeng
 * @date 2022/4/13 9:50
 */
public class JavaCourse implements ICourse{
    Integer id;
    String name;
    Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

}
