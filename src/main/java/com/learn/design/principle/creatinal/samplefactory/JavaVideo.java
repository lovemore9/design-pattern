package com.learn.design.principle.creatinal.samplefactory;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-12 16:04
 * </pre>
 */
@Slf4j
public class JavaVideo extends Video {
    @Override
    public void produce() {
        log.info("录制Java课程视频");
    }
}
