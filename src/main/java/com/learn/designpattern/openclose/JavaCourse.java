package com.learn.designpattern.openclose;

/**
 * java课程
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-12 11:05
 * </pre>
 */
public class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
