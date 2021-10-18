package com.learn.design.principle.structural.facada;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-15 9:11
 * </pre>
 */
@Slf4j
public class GiftExchangeService {
    private QualifyService qualifyService;
    private PointsPaymentService pointsPaymentService;
    private ShippingService shippingService;

    public GiftExchangeService() {
        this.qualifyService = new QualifyService();
        this.pointsPaymentService = new PointsPaymentService();
        this.shippingService = new ShippingService();
    }

    public void giftExchange(PointGift pointGift) {
        if (qualifyService.isAvailable(pointGift)) {
            // 资格校验通过
            if (pointsPaymentService.pay(pointGift)) {
                // 支付积分成功
                String orderNo = shippingService.shipGift(pointGift);
                log.info("物流单号生成：{}", orderNo);

            }
        }
    }
}
