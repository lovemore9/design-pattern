package com.learn.design.principle.creatinal.sigleton;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-14 15:14
 * </pre>
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> THREAD_LOCAL_INSTANCE
            = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance(){};

    public static ThreadLocalInstance getInstance() {
        return THREAD_LOCAL_INSTANCE.get();
    }

}
