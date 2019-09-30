package code.me.chapter11_activemq.jms;

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
}
