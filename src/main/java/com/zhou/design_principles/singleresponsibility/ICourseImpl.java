package com.zhou.design_principles.singleresponsibility;

/**
 * @author zhouxufeng
 * @date 2022/4/13 20:41
 */
public class ICourseImpl implements ICourseManager, IcourseContent{
    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }
}
