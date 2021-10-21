package com.learn.design.principle.behavioral.templatemethod;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-20 10:17
 * </pre>
 */
@Slf4j
public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        log.info("提供课程java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
