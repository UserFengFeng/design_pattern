package com.zhou.design_mode.structural.bridge;


/**
 * todo 桥接模式
 * 定义：将抽象部分与它的具体实现部分分离，使它们都可以独立的变化
 *      通过组合的方式建立两个类之间的联系，而不是继承
 * 类型：结构型
 * 优点：分离抽象部分及其具体实现部分
 *      提高了系统的可扩展性
 *      符合开闭原则
 *      符合合成复用原则
 * 缺点：增加了系统的理解与设计难度
 *      需要正确的识别出系统中两个独立变化的维度
 * 适用场景：抽象和具体实现之间增加更多的灵活性
 *         一个类存在两个或多个独立变化的维度，且这两个多个维度都需要独立进行扩展
 *         不希望使用继承，或因为多层继承导致系统类的个数剧增
 *
 * 相关设计模式：桥接模式+组合模式
 *             桥接模式+适配器模式
 *
 * demo场景：用不同的账号打开某个银行账户
 *         银行：中国农业银行 工商银行
 *         账号：活期账号、定期账号
 *
 * */
public class Test {
    public static void main(String[] args) {
        Bank bank = new ICBCBank(new DepositAccount());
        Account account = bank.openAccount();
        account.showAccountType();

        Bank abcBank2 = new ICBCBank(new SavingAccout());
        Account account2 = abcBank2.openAccount();
        account2.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccout());
        Account account1 = abcBank.openAccount();
        account1.showAccountType();




    }
}
