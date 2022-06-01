package com.zhou.design_mode.creational.simplefactory;

import java.util.Calendar;

/**
 * todo 简单工厂
 * @author zhouxufeng
 * @date 2022/4/28 10:48
 */
public class Test {
    public static void main(String[] args) {
        // VideoFactory videoFactory = new VideoFactory();
        // Video java = videoFactory.getVideo("java");
        // if(java == null) {
        //     return;
        // }
        //
        // java.product();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video == null) {
            return;
        }
        video.product();



    }
}
