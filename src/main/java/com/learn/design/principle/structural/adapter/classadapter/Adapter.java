package com.learn.design.principle.structural.adapter.classadapter;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-18 14:25
 * </pre>
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        //增加各种逻辑代码
        super.adapteeRequest();
    }
}
