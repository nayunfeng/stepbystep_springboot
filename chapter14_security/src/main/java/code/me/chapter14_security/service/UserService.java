package code.me.chapter14_security.service;

import code.me.chapter14_security.domain.User;

/**
 * @author nayunfeng
 * @date 2019/10/9 15:21
 * @description
 */
public interface UserService {
    User findByUsername(String username);
}
