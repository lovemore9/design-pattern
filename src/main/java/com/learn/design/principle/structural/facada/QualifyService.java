package com.learn.design.principle.structural.facada;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-15 9:06
 * </pre>
 */
@Slf4j
public class QualifyService {
    public boolean isAvailable(PointGift gift) {
        log.info("校验" + gift.getName() + " 积分资格通过，库存通过");
        return true;
    }
}
