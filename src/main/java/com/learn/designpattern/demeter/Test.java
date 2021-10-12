package com.learn.designpattern.demeter;

/**
 * 迪米特法则测试类
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-12 15:02
 * </pre>
 */
public class Test {
    public static void main(String[] args) {
        new Boss().commandCheckNumber(new TeamLeader());
    }
}
