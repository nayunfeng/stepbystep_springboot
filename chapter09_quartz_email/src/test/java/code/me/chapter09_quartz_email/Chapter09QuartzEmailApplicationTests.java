package code.me.chapter09_quartz_email;

import code.me.chapter09_quartz_email.email.SendMail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter09QuartzEmailApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private SendMail sendMail;
    /**
     * 测试发送邮件
     */
    @Test
    public void sendMail() {
        sendMail.send();
    }
}
