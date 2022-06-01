package com.zhou.design_principles.liskovsubstiution;

/**
 * @author zhouxufeng
 * @date 2022/4/15 8:55
 */
public class Rectangle implements Quadrangle
{

    private long length, width;

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLength() {
        return length;
    }
}
