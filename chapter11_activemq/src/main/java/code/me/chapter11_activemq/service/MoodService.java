package code.me.chapter11_activemq.service;

import code.me.chapter11_activemq.domain.Mood;

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
}
