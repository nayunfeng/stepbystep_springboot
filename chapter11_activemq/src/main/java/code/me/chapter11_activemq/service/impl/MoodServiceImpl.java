package code.me.chapter11_activemq.service.impl;

import code.me.chapter11_activemq.dao.MoodRepository;
import code.me.chapter11_activemq.domain.Mood;
import code.me.chapter11_activemq.jms.MoodProducer;
import code.me.chapter11_activemq.service.MoodService;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import java.util.List;
import java.util.concurrent.Future;

/**
 * @author nayunfeng
 * @date 2019/9/27 18:19
 * @description
 */
@Service
@EnableAsync
public class MoodServiceImpl implements MoodService {
    @Autowired
    private MoodRepository moodRepository;

    @Autowired
    private MoodProducer moodProducer;

    @Autowired
    private static final Destination destination = new ActiveMQQueue("mood.async");

    /**
     * 保存说说
     *
     * @param mood 说说内容
     * @return Mood
     */
    @Override
    public Mood save(Mood mood) {
        return moodRepository.save(mood);
    }

    /**
     * 异步保存说说
     *
     * @param mood 说说内容
     * @return String
     */
    @Override
    public String asyncSave(Mood mood) {
        // 往队列mood.async推送消息,消息内容为说说实体
        moodProducer.sendMessage(destination, mood);
        return "success";
    }

    /**
     * 查询所有说说
     *
     * @return List
     */
    @Override
    public List<Mood> findAll() {
        System.out.println("开始做任务");
        long startTime = System.currentTimeMillis();
        List<Mood> moodList = moodRepository.findAll();
        long endTime = System.currentTimeMillis();
        System.out.println("完成任务，耗时：" + (endTime - startTime) + "毫秒");
        return moodList;
    }

    /**
     * 异步方式查询所有说说
     *
     * @return List
     */
    @Async
    @Override
    public Future<List<Mood>> asyncFindAll() {
        System.out.println("开始做任务");
        long startTime = System.currentTimeMillis();
        List<Mood> moodList = moodRepository.findAll();
        long endTime = System.currentTimeMillis();
        System.out.println("完成任务，耗时：" + (endTime - startTime) + "毫秒");
        return new AsyncResult<>(moodList);
    }
}
