package com.learn.design.jvmthreadpool;

import java.util.concurrent.*;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-11-01 14:44
 * </pre>
 */
public class ThreadPoolCoreTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);

    }
}
