package com.zhou.design_principles.liskovsubstiution;

/**
 * @author zhouxufeng
 * @date 2022/4/15 8:55
 */
public class Square implements Quadrangle {
    private long sideLength;


    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }
}
