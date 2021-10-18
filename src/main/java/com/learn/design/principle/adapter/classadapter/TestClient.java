package com.learn.design.principle.adapter.classadapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-18 14:26
 * </pre>
 */
@Slf4j
public class TestClient {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
