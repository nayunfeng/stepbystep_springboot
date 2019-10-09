package code.me.chapter14_security.service.impl;

import code.me.chapter14_security.domain.User;
import code.me.chapter14_security.repository.UserRepository;
import code.me.chapter14_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author nayunfeng
 * @date 2019/10/9 15:22
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
