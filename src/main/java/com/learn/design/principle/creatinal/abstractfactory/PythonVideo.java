package com.learn.design.principle.creatinal.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-13 13:17
 * </pre>
 */
@Slf4j
public class PythonVideo extends Video{
    @Override
    public void produce() {
        log.info("创作Python课程");
    }
}
