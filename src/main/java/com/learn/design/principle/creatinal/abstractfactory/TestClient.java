package com.learn.design.principle.creatinal.abstractfactory;

/**
 * 抽象工厂测试类
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-13 13:28
 * </pre>
 */
public class TestClient {

    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        factory.getArticle().produce();
        factory.getVideo().produce();
    }
}
