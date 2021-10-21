package com.learn.design.principle.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-20 13:52
 * </pre>
 */
@Slf4j
public class TestClient {
    //public static void main(String[] args) {
    //    PromotionStrategy liJianPromotionStrategy = new LiJianPromotionStrategy();
    //    PromotionStrategy manJianPromotionStrategy = new ManJianPromotionStrategy();
    //
    //
    //    PromotionActivity promotionActivity1111 = new PromotionActivity(liJianPromotionStrategy);
    //
    //    promotionActivity618.executePromotionStrategy();
    //    promotionActivity1111.executePromotionStrategy();
    //}
    public static void main(String[] args) {
        PromotionStrategy promotionstrategy = PromotionStrategyFactory.getPromotionstrategy(PromotionStrategyFactory.Promotion.LIJIAN);
        PromotionActivity promotionActivity618 = new PromotionActivity(promotionstrategy);
        promotionActivity618.executePromotionStrategy();

    }
}
