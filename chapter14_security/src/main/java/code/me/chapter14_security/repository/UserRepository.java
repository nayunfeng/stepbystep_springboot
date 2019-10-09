package code.me.chapter14_security.repository;

import code.me.chapter14_security.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nayunfeng
 * @date 2019/10/9 14:48
 * @description
 */
public interface UserRepository extends JpaRepository<User,String> {
    User findByUsername(String username);
}
