package com.zhou.design_principles.demeter;

/**
 * @author zhouxufeng
 * @date 2022/4/14 8:58
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader) {

        teamLeader.courseNum();
    }

}
