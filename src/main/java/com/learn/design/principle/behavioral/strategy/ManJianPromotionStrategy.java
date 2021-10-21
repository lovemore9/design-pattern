package com.learn.design.principle.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-20 13:44
 * </pre>
 */
@Slf4j
public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        log.info("满减策略，满200减20");
    }
}