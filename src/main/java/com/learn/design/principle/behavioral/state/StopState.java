package com.learn.design.principle.behavioral.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-22 10:07
 * </pre>
 */
@Slf4j
public class StopState extends CourseVideoState{

    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        log.info("ERROR 停止状态不能快进");
    }

    @Override
    public void pause() {
        log.info("ERROR 停止状态不能暂停");
    }

    @Override
    public void stop() {
        log.info("停止状态");
    }
}
