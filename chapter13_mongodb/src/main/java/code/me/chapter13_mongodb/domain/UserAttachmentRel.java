package code.me.chapter13_mongodb.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author nayunfeng
 * @date 2019/10/9 11:33
 * @description 用户附件类
 */
@Data
public class UserAttachmentRel {
    @Id
    private String id;
    private String userId;
    private String filename;
}
