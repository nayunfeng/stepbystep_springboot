package code.me.chapter11_activemq.service;

import code.me.chapter11_activemq.domain.Mood;

import java.util.List;
import java.util.concurrent.Future;

/**
 * @author nayunfeng
 * @date 2019/9/27 18:15
 * @description
 */
public interface MoodService {
    /**
     * 保存说说
     * @param mood 说说内容
     * @return Mood
     */
    Mood save(Mood mood);

    /**
     * 异步保存说说
     * @param mood 说说内容
     * @return String
     */
    String asyncSave(Mood mood);

    /**
     * 查询所有说说
     * @return List
     */
    List<Mood> findAll();

    /**
     * 异步方式查询所有说说
     * @return List
     */
    Future<List<Mood>> asyncFindAll();
}
