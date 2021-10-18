package com.learn.design.principle.flyweight;

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
            String department = departments[(int) Math.random() * departments.length];
            Manager manager = (Manager) EmplyeeFactory.getManager(department);
            manager.setReportContent("作报告");
            manager.report();
        }

    }
}
