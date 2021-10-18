package com.learn.design.principle.creatinal.prototype;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-14 15:46
 * </pre>
 */
@Slf4j
@Data
@ToString
public class Mail implements Cloneable{
    private String name;
    private String emailAddress;
    private String content;

    public Mail() {
        log.info("Mail Class Constructor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        log.info("克隆方法执行了");
        return super.clone();
    }
}
