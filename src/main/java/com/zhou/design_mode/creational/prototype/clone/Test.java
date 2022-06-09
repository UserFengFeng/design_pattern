package com.zhou.design_mode.creational.prototype.clone;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Date birthday = new Date(0L);
        // Pig pig = new Pig("佩奇", birthday);
        // Pig clone = (Pig) pig.clone();
        // System.out.println(pig);
        // System.out.println(clone);

        /**
         * 只修改了pig的生日 但是clone也跟着变化了  因为birthday用的同一个对象  属于浅克隆 所以跟预想中的结果不一样
         * 所以要深克隆 要将单属性在重写clone时也要进行克隆
         * */
        // pig.getBirthday().setTime(666666666666L);
        //
        // System.out.println(pig);
        // System.out.println(clone);

        // 根据CacheKey类的源码来看updateList属性是否是同一个
        MockCacheKey mockCacheKey = new MockCacheKey();
        MockCacheKey clone = (MockCacheKey) mockCacheKey.clone();
        // 发现并不是同一个
        System.out.println(mockCacheKey);
        System.out.println(clone);

    }
}
