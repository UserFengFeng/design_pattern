package com.zhou.design_principles.dependenceinversion;

/**
 * @author zhouxufeng
 * @date 2022/4/13 19:39
 */
public class JavaCourse implements ICourse{
    @Override
    public void stutyCourse() {
        System.out.println("学习java课程");
    }
}
