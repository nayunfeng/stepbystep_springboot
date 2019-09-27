package code.me.chapter11_activemq.dao;

import code.me.chapter11_activemq.domain.Mood;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nayunfeng
 * @date 2019/9/27 18:15
 * @description
 */
public interface MoodRepository extends JpaRepository<Mood,String> {
}
