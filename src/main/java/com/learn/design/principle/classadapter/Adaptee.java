package com.learn.design.principle.classadapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-15 16:41
 * </pre>
 */
@Slf4j
public class Adaptee {
    public void adapteeRequest() {
        log.info("被适配者的方法看看我能提交不111");
    }
}
