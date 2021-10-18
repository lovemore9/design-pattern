package com.learn.design.principle.creatinal.sigleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-14 9:20
 * </pre>
 */
@Slf4j
public enum EnumInstance {
    /**
     * 实例对象
     */
    INSTANCE{
        @Override
        protected void printTest() {
            log.info("print Test");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return EnumInstance.INSTANCE;
    }
}
