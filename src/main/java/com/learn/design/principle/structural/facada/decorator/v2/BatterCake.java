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
public class BatterCake extends ABatterCake{
    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int price() {
        return 8;
    }
}
