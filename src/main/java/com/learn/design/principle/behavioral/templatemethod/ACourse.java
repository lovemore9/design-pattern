package com.learn.design.principle.behavioral.templatemethod;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-20 10:11
 * </pre>
 */
@Slf4j
public abstract class ACourse {

    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (this.needWriteArticle()) {
            this.makeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        log.info("制作PPT");
    }

    final void makeVideo(){
        log.info("制作视频");
    }

    final void makeArticle(){
        log.info("编写手记");
    }

    //钩子方法
    protected boolean needWriteArticle() {
        return false;
    }

    abstract void packageCourse();
}
