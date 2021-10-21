package com.learn.design.principle.behavioral.command;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-21 9:35
 * </pre>
 */
@Slf4j
public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open() {
        log.info("{}视频课程开放", this.name);
    }

    public void close() {
        log.info("{}视频课程关闭", this.name);
    }
}
