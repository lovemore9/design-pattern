package com.learn.design.principle.creatinal.builder;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-13 13:51
 * </pre>
 */
@Data
@ToString
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;
}
