package com.zhou.design_mode.creational.prototype;

import com.zhou.design_mode.creational.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 原型模式
 *定义：指原型实例指定创建对象的种类，并且通过拷贝这些原型创建的新的对象
 *     不需要知道任何创建的细节，不调用构造函数
 *使用场景：类初始化消耗较多的资源
 *        new产生的一个对象需要非常繁琐的过程（准备数据、访问权限等）
 *        构造函数比较复杂
 *        循环体中生产大量对象时
 * 优点：原型模式性能比直接new一个对象性能高
 *      简化创建过程
 * 缺点：必须配备克隆方法
 *      对克隆复杂对象或对克隆出的对象进行复杂改造时，容易引入风险
 *      深拷贝、浅拷贝要运用得当
* */

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // Mail mail = new Mail();
        // mail.setContent("初始化模板");
        // System.out.println("初始化mail" + mail);
        // for (int i = 0; i < 10; i++) {
        //     Mail clone = (Mail) mail.clone();
        //     clone.setName("名称" + i);
        //     clone.setEmailAddress("地址" + i);
        //     clone.setContent("恭喜你中奖了");
        //     MailUtil.sendMail(clone);
        //     System.out.println("克隆mail" + mail);
        //
        // }
        // MailUtil.saveOrginMailRecord(mail);

        // HungrySingleton instance = HungrySingleton.getInstance();
        // Method clone = instance.getClass().getDeclaredMethod("clone");
        // clone.setAccessible(true);
        // HungrySingleton cloneHungrySingleton = (HungrySingleton) clone.invoke(instance);
        // todo 遭到了破坏 两个对象不是同一个地址 所以要将HungrySingleton中的clone方法改成直接调用getInstance
        // System.out.println(instance);
        // System.out.println(cloneHungrySingleton);
    }
}
