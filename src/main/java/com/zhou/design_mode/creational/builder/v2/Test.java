package com.zhou.design_mode.creational.builder.v2;

import com.google.common.collect.ImmutableSet;

/**
 * @author zhouxufeng
 * @date 2022/5/9 10:24
 */
public class Test {
    public static void main(String[] args) {
        // 建造者模式链式调用
        Course course = new Course.CourseBuilder()
                .buildCourseName("java设计模式")
                .buildCourseArticle("手记")
                .buildCoursePPT("ppt")
                .buildCourseQA("问答")
                .buildCourseVideo("视频").buider();

        // System.out.println(course);

        ImmutableSet<String> build = ImmutableSet.<String>builder().add("a").add("b").build();
        System.out.println(build);
    }
}
