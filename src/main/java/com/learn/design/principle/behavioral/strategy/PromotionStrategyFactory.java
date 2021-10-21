package com.learn.design.principle.behavioral.strategy;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-20 14:06
 * </pre>
 */
public class PromotionStrategyFactory {

    private static Map<String, PromotionStrategy> PROMOTIONSTRATEGY_MAP = new HashMap<>();
    private static PromotionStrategy EMPTY_PROMOTIONSTRATEGY = new EmptyPromotionStrategy();
    static {
        PROMOTIONSTRATEGY_MAP.put(Promotion.LIJIAN, new LiJianPromotionStrategy());
        PROMOTIONSTRATEGY_MAP.put(Promotion.MANJIAN, new ManJianPromotionStrategy());
        PROMOTIONSTRATEGY_MAP.put(Promotion.FANXIAN, new FanXianPromotionStrategy());
    }

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionstrategy(String key) {
        PromotionStrategy promotionStrategy = PROMOTIONSTRATEGY_MAP.getOrDefault(key, EMPTY_PROMOTIONSTRATEGY);
        return promotionStrategy;
    }

    public interface Promotion{
        String LIJIAN = "LIJIAN";
        String MANJIAN = "MANJIAN";
        String FANXIAN = "FANXAIN";
    }
}
