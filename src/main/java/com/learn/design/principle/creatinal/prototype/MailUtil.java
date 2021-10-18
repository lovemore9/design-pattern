package com.learn.design.principle.creatinal.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-14 15:48
 * </pre>
 */
@Slf4j
public class MailUtil {
    public static void sendMail(Mail mail) {
        String outputContent = "向{}同学，邮件地址{}，邮件内容{}，发送邮件。";
        log.info(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent());
    }

    public static void saveOriginMailRecord(Mail mail) {
        log.info("存储originMail记录，originMail:{}", mail.getContent());
    }
}
