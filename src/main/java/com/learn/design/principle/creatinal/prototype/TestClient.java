package com.learn.design.principle.creatinal.prototype;

/**
 * 类简要说明
 *
 * @author YJ WANG
 * @version 1.0
 * </pre>
 * Created on 2021-10-14 15:50
 * </pre>
 */
public class TestClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");

        for (int i = 0; i < 10; i++) {
            Mail clone = (Mail)mail.clone();
            clone.setName("姓名" + i);
            clone.setEmailAddress("姓名" + i + "@qq.com");
            clone.setContent("恭喜您，本次活动中奖了");
            MailUtil.sendMail(clone);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
