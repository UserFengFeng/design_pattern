package com.zhou.design_principles.dependenceinversion;

/**
 * TODO 依赖倒置原则
 * @author zhouxufeng
 * @date 2022/4/13 19:37
 */
public class Test {
    //日常操作
    // public static void main(String[] args) {
    //     Geely geely = new Geely();
    //     geely.studyFECourse();
    //     geely.studyFECourse();
    // }

    // // 接口方式
    // public static void main(String[] args) {
    //     Geely geely = new Geely();
    //     geely.studyImoocCourse(new FECourse());
    //     geely.studyImoocCourse(new JavaCourse());
    // }

    // 构造器方式
    // public static void main(String[] args) {
    //     Geely geely = new Geely(new FECourse());
    //     geely.studyImoocCourse();
    // }

    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setiCourse(new FECourse());
        geely.studyImoocCourse();
    }
}
