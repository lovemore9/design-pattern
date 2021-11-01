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
public class ThreadPoolTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(
                        10, /* 核心线程数*/
                        10, /* 核心线程数+非核心线程数*/
                        10L, /* 线程允许的空闲时间，默认情况下非核心线程的空闲时间，但如果allowCoreThreadTimeOut为True核心线程也会回收*/
                        TimeUnit.SECONDS,
                        new LinkedBlockingQueue<>(), /*存储等待执行的过程*/
                        Executors.defaultThreadFactory(), /*线程工厂*/
                        new ThreadPoolExecutor.AbortPolicy()/*拒绝任务的策略*/
                );

        threadPoolExecutor.allowCoreThreadTimeOut(true);
        // 核心线程 -》正式员工
        // 非核心线程 -》临时员工
        // defaultThreadFactory -》 人才市场
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程池测试1");
            }
        });

        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程池测试2");
            }
        });

        Future<String> future = threadPoolExecutor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "测试submit";
            }
        });
        String s = future.get();
        System.out.println(s);
        threadPoolExecutor.shutdown();
    }
}
