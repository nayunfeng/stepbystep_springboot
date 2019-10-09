package code.me.chapter11_activemq;

import code.me.chapter11_activemq.domain.Mood;
import code.me.chapter11_activemq.jms.MoodProducer;
import code.me.chapter11_activemq.service.MoodService;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.Future;

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

    @Autowired
    private MoodService moodService;

    /**
     * 测试异步保存说说
     */
    @Test
    public void asyncSave() {
        Mood mood = new Mood();
        mood.setId("2");
        mood.setContent("这是我的第二条说说");
        mood.setUserId("2");
        mood.setPraiseNum(0);
        mood.setPublishTime(LocalDateTime.now());
        moodService.asyncSave(mood);
    }

    /**
     * 测试 同步查询
     */
    @Test
    public void findAll() {
        long startTime = System.currentTimeMillis();
        System.out.println("第一次查询");
        List<Mood> moodList1 = moodService.findAll();
        System.out.println("第二次查询");
        List<Mood> moodList2 = moodService.findAll();
        System.out.println("第三次查询");
        List<Mood> moodList3 = moodService.findAll();
        long endTime = System.currentTimeMillis();
        System.out.println("总耗时：" + (endTime - startTime) + "毫秒");
    }

    /**
     * 测试 异步查询
     */
    @Test
    public void asyncFindAll() {
        long startTime = System.currentTimeMillis();
        System.out.println("第一次查询");
        Future<List<Mood>> moodList1 = moodService.asyncFindAll();
        System.out.println("第二次查询");
        Future<List<Mood>> moodList2 = moodService.asyncFindAll();
        System.out.println("第三次查询");
        Future<List<Mood>> moodList3 = moodService.asyncFindAll();
        while (true) {
            if (moodList1.isDone() && moodList2.isDone() && moodList3.isDone()) {
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("总耗时：" + (endTime - startTime) + "毫秒");
    }
}
