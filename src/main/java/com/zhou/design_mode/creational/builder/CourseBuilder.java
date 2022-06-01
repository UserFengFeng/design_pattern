package com.zhou.design_mode.creational.builder;

/**
 * @author zhouxufeng
 * @date 2022/5/9 9:56
 */
public abstract class CourseBuilder {
    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String courseName);
    public abstract void buildCourseVideo(String courseName);
    public abstract void buildCourseArticle(String courseName);
    public abstract void buildCourseQA(String courseName);

    public abstract Course makeCourse();
}
