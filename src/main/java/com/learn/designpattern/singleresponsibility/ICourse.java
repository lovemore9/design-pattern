package com.learn.designpattern.singleresponsibility;

/**
 * 课程
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-12 14:24
 * </pre>
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
