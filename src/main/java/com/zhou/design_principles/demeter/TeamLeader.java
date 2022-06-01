package com.zhou.design_principles.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouxufeng
 * @date 2022/4/14 8:59
 */
public class TeamLeader {
    void courseNum() {
        List<Course> courses = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println("课程数量"+ courses.size());
    }
}
