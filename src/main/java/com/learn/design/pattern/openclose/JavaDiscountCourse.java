package com.learn.design.pattern.openclose;

/**
 * java打折
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-12 11:16
 * </pre>
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
