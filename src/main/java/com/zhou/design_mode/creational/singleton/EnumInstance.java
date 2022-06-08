package com.zhou.design_mode.creational.singleton;

public enum EnumInstance {
    INSTANCE {
        protected void printTest(){
            System.out.println("Geely Print test");
        }
    };
    // 不声明这个类是调用不到上面的printTest
    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
