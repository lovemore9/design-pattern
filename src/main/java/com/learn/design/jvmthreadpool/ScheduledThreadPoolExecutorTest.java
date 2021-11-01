package com.learn.design.jvmthreadpool;

import java.util.concurrent.*;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-11-01 16:10
 * </pre>
 */
public class ScheduledThreadPoolExecutorTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(
                10,
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        executor.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("aaaa");
            }
        }, 3, TimeUnit.SECONDS);


        ScheduledFuture<String> schedule = executor.schedule(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "bbb";
            }
        }, 4, TimeUnit.SECONDS);
        System.out.println(schedule.get());

        executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("cccc");
            }
            // 0：第一次执行任务，延时多久 3：每隔多久执行这个任务
        }, 0, 3, TimeUnit.SECONDS);

        executor.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("ddd");
            }
            // 0：第一次执行任务，每次执行完任务之后延迟多久再次执行任务 3：每隔多久执行这个任务
        }, 0, 3, TimeUnit.SECONDS);
    }
}
