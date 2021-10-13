package com.learn.design.principle.creatinal.sigleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-13 15:15
 * </pre>
 */
@Slf4j
public class TestClient {
    public static void main(String[] args) {
        //LazySingleton instance = LazySingleton.getInstance();
        //log .info(instance.toString());
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        log.info("启动成功");
    }
}
