package com.learn.design.pattern.openclose;

import lombok.extern.slf4j.Slf4j;

/**
 * 开闭原则测试类
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-12 11:07
 * </pre>
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "java课程", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse)iCourse;
        log.info("课程ID：{}，课程名称：{}，课程价格：{}，课程原价：{}", javaCourse.getId(), javaCourse.getName(), javaCourse.getPrice(), javaCourse.getOriginPrice());
    }
}
