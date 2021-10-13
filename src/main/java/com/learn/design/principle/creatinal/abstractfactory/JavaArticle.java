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
public class JavaArticle extends Article{
    @Override
    public void produce() {
        log.info("编写java课程手记");
    }
}
