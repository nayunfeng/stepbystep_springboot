package code.me.chapter13_mongodb.service.impl;

import code.me.chapter13_mongodb.domain.UserAttachmentRel;
import code.me.chapter13_mongodb.repository.UserAttachmentRelRepository;
import code.me.chapter13_mongodb.service.UserAttachmentRelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nayunfeng
 * @date 2019/10/9 11:39
 * @description 用户附件服务层
 */
@Service
public class UserAttachmentRelServiceImpl implements UserAttachmentRelService {

    @Autowired
    private UserAttachmentRelRepository userAttachmentRelRepository;

    @Override
    public UserAttachmentRel save(UserAttachmentRel userAttachmentRel) {
        return userAttachmentRelRepository.save(userAttachmentRel);
    }

    @Override
    public List<UserAttachmentRel> findAll() {
        return userAttachmentRelRepository.findAll();
    }
}
