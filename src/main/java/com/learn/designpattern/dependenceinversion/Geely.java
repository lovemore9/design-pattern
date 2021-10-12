package com.learn.designpattern.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * Geely
 *
 * @author YJ WANG
 * Created on 2021-10-12 13:15
 */
@Slf4j
public class Geely {

    private ICourse iCourse;

    public Geely() {}

    public Geely(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}
