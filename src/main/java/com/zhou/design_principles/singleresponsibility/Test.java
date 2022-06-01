package com.zhou.design_principles.singleresponsibility;

/**TODO 单一职责原则
 * @author zhouxufeng
 * @date 2022/4/13 20:24
 */
public class Test {
    public static void main(String[] args) {
        // Bird bird = new Bird();
        // bird.mainMoveMode("大雁");
        // bird.mainMoveMode("鸵鸟");
        // bird.mainMoveMode("企鹅");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.flyBird("大雁");

    }
}
