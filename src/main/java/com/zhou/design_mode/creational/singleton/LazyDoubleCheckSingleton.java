package com.zhou.design_mode.creational.singleton;

/**
 *  *  * 懒汉式
 * @author zhouxufeng
 * @date 2022/5/12 9:03
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazySingleton = null;

    private LazyDoubleCheckSingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazyDoubleCheckSingleton();
                    //  1.分配内存给这个对象
                    //  2.初始化对象
                    //  3.设置 lazySingleton 指向刚分配的内存地址
                    // TODO java语言规范里面 所有单线程在执行java程序时  必须要遵守intra-thread semantics规定 保证重排序不会改变单线程内的程序执行结果
                    //  4.初次访问
                    /**
                     * TODO 2 3会颠倒顺序  当加了volatile关键字（所有线程共享内存，保证了内存的可见性）  将不会再重排序
                     * 线程0                         线程1
                     * 1.分配对象的内存空间
                     * 3.设置instance指向内存空间
                     *                              判断instance是否为null
                     *                              初次访问对象
                     *
                     * 2.初始化对象
                     * 4.初次访问对象
                     *
                     *
                     * 如果不加volatile 线程1会报错  线程0 还没初始化对象完毕  线程1就进行访问了
                     */

                }
            }
        }
        return lazySingleton;
    }
}
