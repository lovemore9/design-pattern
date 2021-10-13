package com.learn.design.principle.creatinal.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * 建造者模式测试类
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-13 13:50
 * </pre>
 */
@Slf4j
public class TestClient {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(builder);
        Course course = coach.makeCourse("设计模式", "PPT", "视频", "手记", "问答");
        log.info(course.toString());

    }
}
