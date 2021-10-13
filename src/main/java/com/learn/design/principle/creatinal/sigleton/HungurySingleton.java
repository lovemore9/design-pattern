package com.learn.design.principle.creatinal.sigleton;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-13 16:26
 * </pre>
 */
public class HungurySingleton {
    private final static HungurySingleton hangurySingleton;
    static {
        hangurySingleton = new HungurySingleton();
    }
    private HungurySingleton() {};
    public static HungurySingleton getInstance() {
        return hangurySingleton;
    }

    /**
     * 该方法是防止序列化后生成其他对象，违背单例原则
     * @return
     */
    private Object readResolve() {
        return hangurySingleton;
    }
}
