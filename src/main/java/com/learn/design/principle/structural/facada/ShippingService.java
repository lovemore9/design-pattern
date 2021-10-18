package com.learn.design.principle.structural.facada;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-15 9:09
 * </pre>
 */
@Slf4j
public class ShippingService {
    public String shipGift(PointGift pointGift) {
        //物流系统对接逻辑
        log.info(pointGift.getName() + " 进入物流系统");
        String shippingOrderNo = "123456";
        return shippingOrderNo;
    }
}
