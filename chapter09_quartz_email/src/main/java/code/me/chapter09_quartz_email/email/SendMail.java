package code.me.chapter09_quartz_email.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.internet.MimeMessage;

/**
 * @author nayunfeng
 * @date 2019/9/21 10:27
 * @description
 */
@Component
public class SendMail {
    @Autowired
    private JavaMailSender mailSender;
    @Value("${spring.mail.username}")
    private String from;

    public void send() {
        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
            // 邮件发送方
            mimeMessageHelper.setFrom(from);
            // 邮件主题
            mimeMessageHelper.setSubject("今日地瓜特卖");
            // 邮件接收方
            mimeMessageHelper.setTo("13137999097@163.com");
            // 邮件内容
            mimeMessageHelper.setText("今日地瓜特卖，只要9.9元!!");
            mailSender.send(mimeMessage);
        } catch (Exception e) {
            System.out.println("邮件发送失败");
            e.printStackTrace();
        }
    }


}
