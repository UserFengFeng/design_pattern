package com.zhou.design_mode.structural.facade;

public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();

    private ShippingService shippingService = new ShippingService();

    public PointsPaymentService pointsPaymentService = new PointsPaymentService();

    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailabel(pointsGift)) {
            if(pointsPaymentService.pay(pointsGift)) {
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("下单成功 订单号为：" + shippingOrderNo);
            }
        } else {
            System.out.println("校验未通过");
        }
    }
}
