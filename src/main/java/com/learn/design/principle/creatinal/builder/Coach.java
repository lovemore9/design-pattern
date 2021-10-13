package com.learn.design.principle.creatinal.builder;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-13 14:03
 * </pre>
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName, String coursePPt, String courseVideo, String courseArticle, String courseQA) {
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePPT(coursePPt);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseQA(courseQA);

        return courseBuilder.makeCourse();
    }

}
