package com.zhou.design_principles.openclose;

/**
 * @author zhouxufeng
 * @date 2022/4/13 9:51
 * TODO 开闭原则
 */
public class Test {
    public static void main(String[] args) {
        ICourse javaCource = new JavaDiscoutCourse(96, "javaxxxx", 345d);
        JavaDiscoutCourse javaCource1 = (JavaDiscoutCourse) javaCource;
        System.out.println(javaCource.getId() + javaCource.getName() + javaCource.getPrice() + javaCource1.getOriginPrice());
    }
}
