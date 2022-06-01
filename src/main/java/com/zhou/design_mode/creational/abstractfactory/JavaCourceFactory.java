package com.zhou.design_mode.creational.abstractfactory;

/**
 * @author zhouxufeng
 * @date 2022/4/29 11:06
 */
public class JavaCourceFactory implements CourseFactory{
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
