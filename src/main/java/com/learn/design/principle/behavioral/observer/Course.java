package com.learn.design.principle.behavioral.observer;


import javafx.beans.InvalidationListener;
import lombok.extern.slf4j.Slf4j;

import java.util.Observable;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-20 16:04
 * </pre>
 */
@Slf4j
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void producerQuestion(Course course, Question question) {
        log.info("{}在{}提出了问题：{}", question.getUserName(), course.getCourseName(), question.getQuestionContent());
        setChanged();
        notifyObservers(question);
    }

}
