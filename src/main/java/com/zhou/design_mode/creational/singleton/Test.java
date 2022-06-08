package com.zhou.design_mode.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author zhouxufeng
 * @date 2022/5/10 8:52
 * 懒汉式单例设计模式
 * 构造器私有化 防止直接new一个对象 提供一个public的static方法
 *
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // LazySingleton instance = LazySingleton.getInstance();
        // 多线程时会有线程不安全问题（创建了多个对象）
        // Thread thread = new Thread(new T());
        // Thread thread2 = new Thread(new T());
        // thread.start();
        // thread2.start();
        // HungrySingleton instance = HungrySingleton.getInstance();

        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        outputStream.writeObject(instance);

        ObjectInputStream singleton_file = new ObjectInputStream(new FileInputStream("singleton_file"));
        EnumInstance inputHungrysing = (EnumInstance) singleton_file.readObject();
        System.out.println(instance.getData());
        System.out.println(inputHungrysing.getData());
        System.out.println(instance.getData() == inputHungrysing.getData());

        /**
         * TODO
         * 违背了单例模式的初衷 因为是不相等的对象地址
         * 解决方式就是实现readResolve方法
         * 在ObjectInputStream.readObject源码中看以看到object类型如果实现了该方法，
         * 会进行invoke
         * 在readObject中也新实例化了一个对象，
         * 但是由于实现了readResolve方法会直接通过反射返回原有地址的对象
         */
        // System.out.println(inputHungrysing == instance);

        // 反射攻击解决方案及原理分析 主要关注私有构造器
        // Class objectClass = HungrySingleton.class;
        // Class objectClass = LazyDoubleCheckSingleton.class;
        // Class objectClass = StaticInnerClassSingleton.class;

        // Class enumInstanceClass = EnumInstance.class;
        // Constructor constructor = enumInstanceClass.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // EnumInstance o = (EnumInstance) constructor.newInstance();


        // Constructor constructor = objectClass.getDeclaredConstructor();
        // 因为构造器是private 设置权限放开
        // constructor.setAccessible(true);
        //
        // StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        // StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();


        // LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        // LazyDoubleCheckSingleton newInstance = (LazyDoubleCheckSingleton) constructor.newInstance();



        // HungrySingleton instance = HungrySingleton.getInstance();
        // HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

        // System.out.println(instance);
        // System.out.println(newInstance);
        // System.out.println(instance == newInstance);

        EnumInstance instance1 = EnumInstance.getInstance();
        instance1.printTest();

    }
}
