package com.learn.design.principle.behavioral.templatemethod;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-20 10:18
 * </pre>
 */
@Slf4j
public class TestClient {
    public static void main(String[] args) {
        log.info("后端设计模式课程start----------------");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        log.info("后端设计模式课程end----------------");
        log.info("--------------------------------");
        log.info("前端模式课程start----------------");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        log.info("前端模式课程end----------------");
    }
}
