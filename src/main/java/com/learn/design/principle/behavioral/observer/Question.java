package com.learn.design.principle.behavioral.observer;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-20 16:04
 * </pre>
 */
public class Question {
    private String userName;
    private String questionContent;

    public Question(String userName, String questionContent) {
        this.userName = userName;
        this.questionContent = questionContent;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
