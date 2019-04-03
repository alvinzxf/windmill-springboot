package com.example.spring.windmill.application;

/**
 * @Author: windmill
 * @Description:邮件service
 * @Date: 2019/3/29 17:00
 */
public interface MailService {
    /**
     * 发送邮件
     *
     * @param to
     * @param subject
     * @param content
     */
    void sendMail(String to, String subject, String content);

    /**
     * 发送含HTML的邮件
     *
     * @param to
     * @param subject
     * @param content
     */
    void sendHtmlMail(String to, String subject, String content);

    /**
     * 发送到附件的邮件
     *
     * @param to
     * @param subject
     * @param content
     * @param filePath
     */
    void sendAttachmentMail(String to, String subject, String content, String filePath);
}
