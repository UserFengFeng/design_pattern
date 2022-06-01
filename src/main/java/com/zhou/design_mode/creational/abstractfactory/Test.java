package com.zhou.design_mode.creational.abstractfactory;

/**
 * @author zhouxufeng
 * @date 2022/5/9 8:52
 *
 * TODO 抽象工厂模式
 * 应用层代码不和具体产品发生依赖，它只和具体的产品族发生依赖关系
 * 扩展性好 符合开闭原则
 *
 * 缺点：原来的产品里扩展新的产品需求，就需要改动所有的工厂代码以及实现相应的工厂类，改动较大
 *
 * 应用场景：产品等级相对固定的，并且还需要多个产品来组合到一起形成产品族（如需要频繁改动则不适用）
 */
public class Test {
    public static void main(String[] args) {
        JavaCourceFactory javaCourceFactory = new JavaCourceFactory();
        Video video = javaCourceFactory.getVideo();
        Article article = javaCourceFactory.getArticle();
        video.product();
        article.product();
    }
}
