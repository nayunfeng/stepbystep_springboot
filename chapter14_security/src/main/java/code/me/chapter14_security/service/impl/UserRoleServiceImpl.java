package code.me.chapter14_security.service.impl;

import code.me.chapter14_security.domain.UserRole;
import code.me.chapter14_security.repository.UserRoleRepository;
import code.me.chapter14_security.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nayunfeng
 * @date 2019/10/9 15:22
 * @description
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public List<UserRole> findByUserId(String userId) {
        return userRoleRepository.findByUserId(userId);
    }
}
