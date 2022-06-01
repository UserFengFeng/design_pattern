package com.zhou.design_principles.demeter;

/** TODO 迪米特法则
 * @author zhouxufeng
 * @date 2022/4/14 9:06
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);

    }
}
