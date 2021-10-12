package com.learn.designpattern.singleresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-12 14:04
 * </pre>
 */
@Slf4j
public class WalkBird {
    public void mainMoveMode(String birdName) {
        log.info("{} 用脚走", birdName);
    }
}
