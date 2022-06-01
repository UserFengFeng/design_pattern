package com.zhou.design_mode.creational.factorymethod;

/**
 * @author zhouxufeng
 * @date 2022/4/28 16:38
 */
public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
