package com.learn.design.principle.behavioral.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-22 11:02
 * </pre>
 */
@Slf4j
public class TestClient {
    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());

        log.info("当前播放状态：{}", courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.speed();
        log.info("当前播放状态：{}", courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.pause();
        log.info("当前播放状态：{}", courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.stop();
        log.info("当前播放状态：{}", courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.speed();
        log.info("当前播放状态：{}", courseVideoContext.getCourseVideoState().getClass().getSimpleName());
    }
}
