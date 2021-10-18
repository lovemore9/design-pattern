package com.learn.design.principle.structural.facada.decorator.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-15 14:42
 * </pre>
 */
@Slf4j
public class SausageDecorator extends AbstractDecorator {

    @Override
    public void doSomething() {
        log.info("加肠的小动作");
    }

    public SausageDecorator(ABatterCake batterCake) {
        super(batterCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    public int price() {
        return super.price() + 2;
    }
}
