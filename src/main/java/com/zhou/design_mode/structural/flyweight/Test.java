package com.zhou.design_mode.structural.flyweight;

/**
 * todo 享元模式
 * 定义：提供了减少对象数量从而改善应用所需的对象结构方式
 *      运用共享技术有效的支持大量细粒度的对象
 * 类型：结构型
 * 适用场景：常常应用于系统底层的开发，以便解决系统的性能问题
 *          系统有大量相似的对象、需要缓冲池的场景
 * 优点：减少对象的创建，降低内存中的对象数量，降低系统的内存，提高效率
 *      减少内存之外的其他资源占用（比如时间）
 * 缺点：关注内/外部状态、关注线程安全问题
 *      使系统、程序的逻辑复杂化
 * 扩展：内部状态、外部状态态
 *      内部状态：就是一个String xx = "xxx公司"工厂中的常量，不管你是哪个部门进行汇报都属于这个公司，属于共享信息。
 *      外部状态：就是我们的department，属于不可共享信息,简单粗暴理解就是只是一个简单工厂中的标志位。
 *
 * demo: 到年终，每个部门进行汇总报告
 * 源码解析应用：Integer valueOf()
 *
 *
 * */
public class Test {
    private static final String departments[] = {"RD", "QA", "PM"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }

    }
}
