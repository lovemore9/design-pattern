package com.learn.design.principle.creatinal.factorymethod;

/**
 * 简单工程测试类
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-12 16:05
 * </pre>
 */
public class TestClient {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }

}
