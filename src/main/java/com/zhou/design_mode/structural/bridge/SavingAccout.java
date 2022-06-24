package com.zhou.design_mode.structural.bridge;

// 活期存款
public class SavingAccout implements Account{
    public Account openAccout() {
        System.out.println("打开活期账号");
        return new SavingAccout();
    }

    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
