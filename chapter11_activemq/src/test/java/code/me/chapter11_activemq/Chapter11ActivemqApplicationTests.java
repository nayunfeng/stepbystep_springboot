package code.me.chapter11_activemq;

import code.me.chapter11_activemq.jms.MoodProducer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter11ActivemqApplicationTests {

    @Test
    public void contextLoads() {

    }

    @Autowired
    private MoodProducer moodProducer;

    /**
     * 测试发送消息
     */
    @Test
    public void sendMessage() {
        Destination destination = new ActiveMQQueue("mood");
        moodProducer.sendMessage(destination, "Hello ActiveMQ");
    }
}
