package com.learn.design.principle.structural.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-18 16:23
 * </pre>
 */
@Slf4j
public class Manager implements Emplyee {

    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    @Override
    public void report() {
        log.info(reportContent);
    }

    public void setReportContent(String reportContent) {
        this.reportContent = this.department + reportContent;
    }
}
