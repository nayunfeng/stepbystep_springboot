package code.me.chapter11_activemq.jms;

import code.me.chapter11_activemq.domain.Mood;
import code.me.chapter11_activemq.service.MoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author nayunfeng
 * @date 2019/9/30 15:47
 * @description
 */
@Component
public class MoodConsumer {

    @JmsListener(destination = "mood")
    public void receiveQueue(String text) {
        System.out.println("用户发表说说【" + text + "】成功");
    }


    @Autowired
    private MoodService moodService;

    @JmsListener(destination = "mood.async")
    private void receiveQueue(Mood mood){
        moodService.save(mood);
    }
}
