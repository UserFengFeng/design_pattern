package com.zhou.design_mode.creational.prototype.clone;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MockCacheKey implements Cloneable, Serializable {
    private List<Object> updateList;

    public MockCacheKey() {
        this.updateList = new ArrayList<Object>();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        MockCacheKey testCacheKey = (MockCacheKey) super.clone();
        testCacheKey.updateList = new ArrayList(this.updateList);
        return testCacheKey;
    }
}
