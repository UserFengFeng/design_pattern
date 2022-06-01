package com.zhou.design_principles.liskovsubstiution.methdoutput;

/**
 * TODO 里氏替换原则 子类返回值不能大于父类 否则违反里氏替换原则
 * @author zhouxufeng
 * @date 2022/4/15 15:00
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.method());
    }
}
