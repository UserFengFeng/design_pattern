package com.zhou.design_principles.dependenceinversion;

/**
 * @author zhouxufeng
 * @date 2022/4/13 19:40
 */
public class FECourse implements ICourse{
    @Override
    public void stutyCourse() {
        System.out.println("学习fe课程");
    }
}
