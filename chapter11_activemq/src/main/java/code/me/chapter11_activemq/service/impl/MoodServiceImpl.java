package code.me.chapter11_activemq.service.impl;

import code.me.chapter11_activemq.dao.MoodRepository;
import code.me.chapter11_activemq.domain.Mood;
import code.me.chapter11_activemq.service.MoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nayunfeng
 * @date 2019/9/27 18:19
 * @description
 */
@Service
public class MoodServiceImpl implements MoodService {
    @Autowired
    private MoodRepository moodRepository;

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

}
