package code.me.chapter14_security.service;

import code.me.chapter14_security.domain.UserRole;

import java.util.List;

/**
 * @author nayunfeng
 * @date 2019/10/9 15:21
 * @description
 */
public interface UserRoleService {
    List<UserRole> findByUserId(String userId);
}
