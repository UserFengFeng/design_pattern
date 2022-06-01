package com.zhou.design_principles.dependenceinversion;

/**
 * @author zhouxufeng
 * @date 2022/4/13 19:35
 */
public class Geely {

    // public void studyImoocCourse(ICourse course) {
    //     course.stutyCourse();
    // }

    private ICourse iCourse;

    // public Geely(ICourse iCourse) {
    //     this.iCourse = iCourse;
    // }
    //
    public void studyImoocCourse() {
        iCourse.stutyCourse();
    }


    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}
