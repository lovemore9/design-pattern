package com.learn.design.principle.structural.flyweight;

import java.util.Random;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-18 16:46
 * </pre>
 */
public class TestClient {
    private static final String departments[] = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int count = random.nextInt(departments.length);
            String department = departments[count];
            Manager manager = (Manager) EmplyeeFactory.getManager(department);
            manager.setReportContent("作报告");
            manager.report();
        }

    }
}
