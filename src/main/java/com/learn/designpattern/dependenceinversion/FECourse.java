package com.learn.designpattern.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * 前端课程
 *
 * @author YJ WANG
 * Created on 2021-10-12 13:24
 */
@Slf4j
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        log.info("学习前端课程");
    }
}
