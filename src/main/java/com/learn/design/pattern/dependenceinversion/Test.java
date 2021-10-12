package com.learn.design.pattern.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * 依赖倒置原则测试类
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-12 11:07
 * </pre>
 */
@Slf4j
public class Test {

    //public static void main(String[] args) {
    //    Geely geely = new Geely();
    //    geely.studyImoocCourse(new FECourse());
    //}

    //public static void main(String[] args) {
    //    Geely geely = new Geely(new FECourse());
    //    geely.studyImoocCourse();
    //}

    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setiCourse(new FECourse());
        geely.studyImoocCourse();
    }
}
