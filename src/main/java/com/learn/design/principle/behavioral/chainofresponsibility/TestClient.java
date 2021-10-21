package com.learn.design.principle.behavioral.chainofresponsibility;

/**
 * 责任链模式
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-21 11:09
 * </pre>
 */
public class TestClient {
    public static void main(String[] args) {
        ArticleApprover articleApprover = new ArticleApprover();
        VideoApprover videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("设计模式");
        course.setArticle("这是一个手记");
        course.setVideo("这是一个VIDEO");

        articleApprover.setNextApprover(videoApprover);

        articleApprover.deploy(course);
    }
}
