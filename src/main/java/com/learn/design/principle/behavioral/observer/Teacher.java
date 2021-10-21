package com.learn.design.principle.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-20 16:07
 * </pre>
 */
@Slf4j
public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course)o;
        Question question = (Question)arg;
        log.info("{}老师的{}课程接收到一个{}问题：{}", teacherName, course.getCourseName(), question.getUserName(), question.getQuestionContent());
    }
}
