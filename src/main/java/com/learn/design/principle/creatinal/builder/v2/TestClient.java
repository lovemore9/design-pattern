package com.learn.design.principle.creatinal.builder.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-13 14:22
 * </pre>
 */
@Slf4j
public class TestClient {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("name")
                .buildCourseArticle("article")
                .buildCoursePPT("ppt")
                .buildCourseQA("qa")
                .buildCourseVideo("video").build();
        log.info(course.toString());
    }
}
