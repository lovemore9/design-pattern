package com.learn.design.principle.creatinal.sigleton;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-13 15:10
 * </pre>
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton() {};

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
