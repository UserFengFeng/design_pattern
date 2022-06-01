package com.zhou.design_principles.singleresponsibility;

/**
 * @author zhouxufeng
 * @date 2022/4/13 20:12
 */
public class Bird {
    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println("用脚走" + birdName);
        } else {
            System.out.println("会飞的鸟" + birdName);
        }
    }
}
