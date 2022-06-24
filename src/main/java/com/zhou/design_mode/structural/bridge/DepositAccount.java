package com.zhou.design_mode.structural.bridge;

// 定期存款
public class DepositAccount implements Account{
    public Account openAccout() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
