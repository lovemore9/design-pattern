package com.learn.design.jvmthreadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-11-01 16:34
 * </pre>
 */
public class ForkJoinPoolTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Integer> submit = pool.submit(new MyTask(1, 100));
        Integer sum = submit.get();
        System.out.println(sum);

    }


}
class MyTask extends RecursiveTask<Integer> {
    // 当前任务计算的起始
    private int start;
    // 当前任务计算的结束
    private int end;
    // 阈值，如果end-start在阈值内，那么就不用去细分任务了
    private static final int threshold = 2;

    @Override
    protected Integer compute() {
        int sum = 0;
        if ((end - start) > threshold) {
            int middle = (start + end) / 2;
            MyTask leftTask = new MyTask(start, middle);
            MyTask rightTask = new MyTask(middle + 1, end);

            leftTask.fork();
            rightTask.fork();

            Integer leftJoin = leftTask.join();
            Integer rightJoin = rightTask.join();

            sum = leftJoin + rightJoin;
        } else {
            for (int i = start; i <=end; i++) {
                sum += i;
            }
        }
        return sum;
    }

    public MyTask(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
