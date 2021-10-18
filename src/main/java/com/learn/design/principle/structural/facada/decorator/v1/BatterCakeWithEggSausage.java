package com.learn.design.principle.structural.facada.decorator.v1;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-15 14:26
 * </pre>
 */
public class BatterCakeWithEggSausage extends BatterCakeWithEgg{
    @Override
    public String getDesc() {
        return super.getDesc() + "加一个香肠";
    }

    @Override
    public int price() {
        return super.price() + 1;
    }
}
