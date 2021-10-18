package com.learn.design.principle.flyweight;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-18 16:31
 * </pre>
 */
@Slf4j
public class EmplyeeFactory {
    private static final Map<String, Emplyee> EMPLYEE_MAP = new HashMap<>();

    public static Emplyee getManager(String department) {
        Manager manager = (Manager)EMPLYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            EMPLYEE_MAP.put(department, manager);
            log.info("创建部门经理：{}", department);
        }
        return manager;
    }
}
