package com.learn.design.principle.structural.facada;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-15 9:08
 * </pre>
 */
@Slf4j
public class PointsPaymentService {
    public boolean pay(PointGift pointGift) {
        //扣减积分
        log.info("支付" + pointGift.getName() + " 积分成功");
        return true;
    }
}
