package com.example.spring.windmill;

import com.example.spring.windmill.application.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: windmill
 * @Description:邮件测试
 * @Date: 2019/3/29 17:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {
    @Autowired
    private MailService mailService;

    /**
     * 测试发送邮件
     *
     * @throws Exception
     */
    @Test
    public void sendMailTest() throws Exception {
        mailService.sendMail("wind@qq.com", "simple test", "test mail by windmill");
    }

    /**
     * 测试发送HTML邮件
     *
     * @throws Exception
     */
    @Test
    public void sendHtmlMailTest() throws Exception {
        String content = "<html>\n" +
                "<body>\n" +
                "<h1>Hello,我是王多余</h1>\n" + "" +
                "<h3>一个大器晚成的富二代</h3>\n" +
                "</body>\n" +
                "</html>\n";
        mailService.sendHtmlMail("wind@qq.com", "HTML mail test", content);

    }

    /**
     * 测试发送附件形式的邮件
     *
     * @throws Exception
     */
    @Test
    public void sendAttachmentMailTest() throws Exception {
        String filePath = "C:\\Users\\windmill\\Desktop\\1234567.png";
        mailService.sendAttachmentMail("wind@qq.com", "Attachment mail test",
                "你敢点开么？", filePath);

    }
}
