package com.learn.design.principle.structural.facada.decorator.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-15 14:46
 * </pre>
 */
@Slf4j
public class TestClient {

    public static void main(String[] args) {
        ABatterCake aBatterCake = new BatterCake();
        SausageDecorator sausageDecorator = new SausageDecorator(aBatterCake);

        EggDecorator eggDecorator = new EggDecorator(sausageDecorator);
        String desc = eggDecorator.getDesc();
        log.info(desc);
        int price = eggDecorator.price();
        log.info(String.valueOf(price));
    }
}
