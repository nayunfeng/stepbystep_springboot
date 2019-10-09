package code.me.chapter13_mongodb.repository;

import code.me.chapter13_mongodb.domain.UserAttachmentRel;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author nayunfeng
 * @date 2019/10/9 11:36
 * @description 用户附件
 */
public interface UserAttachmentRelRepository extends MongoRepository<UserAttachmentRel,String> {
}
