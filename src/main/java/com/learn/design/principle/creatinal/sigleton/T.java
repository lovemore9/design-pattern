package com.learn.design.principle.creatinal.sigleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-13 15:16
 * </pre>
 */
@Slf4j
public class T implements Runnable{
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        log.info(Thread.currentThread().getName()+lazySingleton);
    }
}
