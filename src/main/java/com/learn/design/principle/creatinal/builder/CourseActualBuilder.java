package com.learn.design.principle.creatinal.builder;


/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-13 13:55
 * </pre>
 */
public class CourseActualBuilder extends CourseBuilder {

    private Course course = new Course();

    @Override
    public void buildCourseName(String courseName) {
        this.course.setCourseName(courseName);
    }

    @Override
    public void buildCoursePPT(String coursePPT) {
        this.course.setCoursePPT(coursePPT);

    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        this.course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        this.course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseQA(String courseQA) {
        this.course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return this.course;
    }
}
