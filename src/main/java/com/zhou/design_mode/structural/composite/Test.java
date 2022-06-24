package com.zhou.design_mode.structural.composite;

/**
 * todo 组合模式
 * 定义：将对象组合成树形结构以表示“部分-整体”的层次结构
 *      组合模式使客户端对单个对象和组合对象保持一致的方式处理
 * 类型：结构型
 * 适用场景：希望客户端可以忽略组合对象与单个对象的差异时
 *          处理一个树形结构
 * 优点：清楚地定义分层次的复杂对象，表示对象的全部或部分层次
 *      让客户端忽略了层次的差异，方便对整个层次结构进行控制
 *      简化客户端代码
 *      符合开闭原则
 * 缺点：限制类型会较为复杂
 *      使设计变得更加抽象
 *
 * 组合模式+访问者模式
 *
 * 试用组合模式：不管是叶子节点还是组合节点都要实现相同或继承相同的抽象类 他们之间是要达成这样的一个关系，只有这样才能将叶子节点对象和组合好的对象进行一致的处理
 * 源码应用：java.awt.Container   HashMap-putAll  ArrayList-addAll  同理set也是一样
 *         跟这个相同使用的源码  MixedSqlNode
 *
 * */
public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux課程", 11);
        CatalogComponent windowsCourse = new Course("windows課程", 12);

        CatalogComponent javaCourseCatalog = new CourseCatalog("java課程目錄", 2);

        Course javaCOurse1 = new Course("java電商一期", 55);
        Course javaCOurse2 = new Course("java電商2期", 44);
        Course javaCOurse3 = new Course("java電商3期", 77);

        javaCourseCatalog.add(javaCOurse1);
        javaCourseCatalog.add(javaCOurse2);
        javaCourseCatalog.add(javaCOurse3);

        CourseCatalog mainCatalog = new CourseCatalog("主目錄",1);
        mainCatalog.add(linuxCourse);
        mainCatalog.add(windowsCourse);
        mainCatalog.add(javaCourseCatalog);

        mainCatalog.print();
    }
}
