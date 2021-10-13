package com.learn.design.principle.creatinal.sigleton;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-13 15:39
 * </pre>
 */
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton() {};

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存
                    //2.初始化内存
                    //3.设置lazyDoubleCheckSingleton指向这个地址
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
