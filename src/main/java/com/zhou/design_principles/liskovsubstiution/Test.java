package com.zhou.design_principles.liskovsubstiution;

import com.zhou.design_principles.liskovsubstiution.methodinput.Child;

import java.util.HashMap;

/**
 * 里氏替换原则
 * @author zhouxufeng
 * @date 2022/4/15 13:28
 */
public class Test {
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setLength(rectangle.getWidth() + 1);
            System.out.println("width: " + rectangle.getWidth() + "length: " + rectangle.getLength());
        }
        System.out.println("wan:  width: " + rectangle.getWidth() + "length: " + rectangle.getLength());
    }

    // public static void main(String[] args) {
    //     Rectangle rectangle = new Rectangle();
    //     rectangle.setWidth(10);
    //     rectangle.setLength(20);
    //     resize(rectangle);
    //
    // }

    // public static void main(String[] args) {
    //     Square square = new Square();
    //     square.setWidth(10);
    //     square.setLength(20);
    //     resize(square);
    //
    // }

    /**
     * 重载时子类的入参(如子类Map  父类HashMap)要比父类更宽松或者相同也可以 否则违反了里氏替换原则 会先调用宽松的方法
     * */
    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }

}
