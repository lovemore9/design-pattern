package com.learn.design.jvmthreadpool;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-11-01 15:59
 * </pre>
 */
public class LinkedBlockingQueueTest {
    public static void main(String[] args) {
        LinkedBlockingQueue<Object> queue = new LinkedBlockingQueue<>(1);
        queue.add("abc");

        boolean def = queue.offer("def");
        System.out.println(def);

    }
}
