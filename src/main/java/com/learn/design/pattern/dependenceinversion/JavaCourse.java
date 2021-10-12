package com.learn.design.pattern.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * Created on 2021-10-12 13:23
 */
@Slf4j
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        log.info("学习Java课程");
    }
}
