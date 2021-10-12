package com.learn.designpattern.demeter;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-12 15:03
 * </pre>
 */
@Slf4j
public class TeamLeader {
    public void checkNumberOfCourses() {

        List<Course> list = new ArrayList<>();
        int i = 1;
        while (i <= 20) {
            list.add(new Course());
            i++;
        }
        log.info("在线课程数量：{}", list.size());
    }
}
