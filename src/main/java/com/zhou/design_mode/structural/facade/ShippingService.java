package com.zhou.design_mode.structural.facade;

public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        // 物流系统的对接逻辑 获取物流订单号
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }

}
