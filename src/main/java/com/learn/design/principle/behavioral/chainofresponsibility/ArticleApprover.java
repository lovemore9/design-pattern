package com.learn.design.principle.behavioral.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-21 11:03
 * </pre>
 */
@Slf4j
public class ArticleApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if (course != null && StringUtils.isNotEmpty(course.getArticle())) {
            log.info("{}含有手记，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            log.info("{}不包含手记，不批准");
        }
    }
}
