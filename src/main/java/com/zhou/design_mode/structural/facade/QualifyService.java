package com.zhou.design_mode.structural.facade;

public class QualifyService {
    public boolean isAvailabel(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + "积分通过，库存通过");
        return true;
    }
}
