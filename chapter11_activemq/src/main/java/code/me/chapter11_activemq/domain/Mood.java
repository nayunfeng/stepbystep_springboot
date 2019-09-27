package code.me.chapter11_activemq.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author nayunfeng
 * @date 2019/9/27 18:12
 * @description
 */
@Data
@Entity
@Table(name = "mood")
public class Mood {
    /**
     * 主键
     */
    @Id
    private String id;
    /**
     * 内容
     */
    private String content;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 点赞数量
     */
    private Integer praiseNum;
    /**
     * 发表时间
     */
    private LocalDateTime publishTime;
}
