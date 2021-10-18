package com.learn.design.principle.structural.facada;

/**
 * 门面模式测试类
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-15 9:18
 * </pre>
 */
public class TestClient {
    public static void main(String[] args) {
        PointGift pointGift = new PointGift("机械键盘");

        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointGift);
    }
}
