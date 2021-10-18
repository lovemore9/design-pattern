package com.learn.design.principle.structural.facada.decorator.v2;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-15 14:34
 * </pre>
 */
public abstract class AbstractDecorator extends ABatterCake {

    private ABatterCake AbatterCake;

    public abstract void doSomething();

    public AbstractDecorator(ABatterCake batterCake) {
        this.AbatterCake = batterCake;
    }

    @Override
    public String getDesc() {
        return this.AbatterCake.getDesc();
    }

    @Override
    public int price() {
        return this.AbatterCake.price();
    }
}
