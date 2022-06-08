package com.zhou.design_mode.creational.singleton;

/**
 * threadlocal线程单例
 * 不能保证全局唯一，但是能保证线程唯一
 * */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {}

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstance.get();
    }
}
