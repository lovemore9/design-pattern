package com.learn.design.pattern.singleresponsibility;

/**
 * 单一职责测试类
 *
 * @author YJ WANG
 * @version 1.0
 * Created on 2021-10-12 14:00
 */
public class Test {
    public static void main(String[] args) {
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }

    public void test01() {

    }
}
