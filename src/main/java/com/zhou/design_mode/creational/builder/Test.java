package com.zhou.design_mode.creational.builder;

/**
 * @author zhouxufeng
 * @date 2022/5/9 10:05
 * TODO 建造者模式
 */
public class Test {
    public static void main(String[] args) {
        CourseActualBuilder courseActualBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseActualBuilder);

        Course course = coach.makeCourse("Java设计模式", "java ppt", "视频", "手记", "问答");
        String s = course.toString();
        System.out.println(s);

    }
}
