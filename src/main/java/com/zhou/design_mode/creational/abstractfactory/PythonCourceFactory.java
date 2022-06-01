package com.zhou.design_mode.creational.abstractfactory;

/**
 * @author zhouxufeng
 * @date 2022/4/29 11:09
 */
public class PythonCourceFactory implements CourseFactory{
    public Video getVideo() {
        return new PythonVideo();
    }

    public Article getArticle() {
        return new PythonArticle();
    }
}
