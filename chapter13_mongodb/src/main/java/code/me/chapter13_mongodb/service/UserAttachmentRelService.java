package code.me.chapter13_mongodb.service;

import code.me.chapter13_mongodb.domain.UserAttachmentRel;

import java.util.List;

/**
 * @author nayunfeng
 * @date 2019/10/9 11:38
 * @description
 */
public interface UserAttachmentRelService {

    UserAttachmentRel save(UserAttachmentRel userAttachmentRel);

    List<UserAttachmentRel> findAll();
}
