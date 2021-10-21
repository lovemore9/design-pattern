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
public class VideoApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if (course != null && StringUtils.isNotEmpty(course.getVideo())) {
            log.info("{}含有视频，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            log.info("{}不包含视频，不批准");
        }
    }
}
