package com.learn.design.principle.structural.facada.decorator.v1;

import lombok.extern.slf4j.Slf4j;

/**
 * 装饰着模式测试类
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-15 14:29
 * </pre>
 */
@Slf4j
public class TestClient {

    public static void main(String[] args) {
        BatterCakeWithEggSausage batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        String desc = batterCakeWithEggSausage.getDesc();
        log.info(desc);
        int price = batterCakeWithEggSausage.price();
        log.info(String.valueOf(price));
    }
}
