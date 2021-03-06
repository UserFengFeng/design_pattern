package com.zhou.design_mode.creational.simplefactory;

/**
 * @author zhouxufeng
 * @date 2022/4/28 10:49
 */
public class VideoFactory {
    public Video getVideo(String type) {
        if("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if("python".equalsIgnoreCase("type")) {
            return new PythonVideo();
        }
        return null;
    }

    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
