package com.learn.design.principle.structural.adapter.classadapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-18 14:24
 * </pre>
 */
@Slf4j
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        log.info("concreteTarget目标方法");
    }
}
