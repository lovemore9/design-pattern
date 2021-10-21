package com.learn.design.principle.behavioral.observer;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-20 16:25
 * </pre>
 */
public class TestClient {
    public static void main(String[] args) {
        Course course = new Course("设计模式精讲");
        Teacher teacher1 = new Teacher("Alpha");
        Teacher teacher2 = new Teacher("Beta");


        course.addObserver(teacher1);
        course.addObserver(teacher2);


        Question question = new Question("Fritz", "主函数如何编写");
        course.producerQuestion(course, question);

    }
}
