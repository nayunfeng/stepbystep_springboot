package code.me.chapter11_activemq.service;
import code.me.chapter11_activemq.domain.Mood;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MoodServiceTest {

    @Autowired
    private MoodService moodService;

    @Test
    public void save() {
        Mood mood = new Mood();
        mood.setId("1");
        mood.setContent("这是我的第一条微信说说");
        mood.setUserId("1");
        mood.setPraiseNum(0);
        mood.setPublishTime(LocalDateTime.now());

        moodService.save(mood);
    }
}