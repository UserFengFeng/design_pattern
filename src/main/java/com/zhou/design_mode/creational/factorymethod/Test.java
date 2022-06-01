package com.zhou.design_mode.creational.factorymethod;

/**
 * todo 工厂模式
 * @author zhouxufeng
 * @date 2022/4/28 10:48
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.product();
    }
}
