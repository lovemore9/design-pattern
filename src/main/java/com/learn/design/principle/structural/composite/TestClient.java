package com.learn.design.principle.structural.composite;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-19 11:20
 * </pre>
 */
public class TestClient {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("linux课程", 11);
        CatalogComponent windowsCourse = new Course("Windows课程", 33);
        CatalogComponent java1Course = new Course("java一期课程", 123);
        CatalogComponent java2Course = new Course("java二期课程", 452);
        CatalogComponent javaDesignPatternCourse = new Course("java设计模式课程", 324);

        CatalogComponent javaCourseCatalog = new CourseCatalog("java课程");
        javaCourseCatalog.add(java1Course);
        javaCourseCatalog.add(java2Course);
        javaCourseCatalog.add(javaDesignPatternCourse);

        CatalogComponent mainCourseCatalog = new CourseCatalog("主目录课程");
        mainCourseCatalog.add(linuxCourse);
        mainCourseCatalog.add(windowsCourse);
        mainCourseCatalog.add(javaCourseCatalog);

        mainCourseCatalog.print();
    }
}
