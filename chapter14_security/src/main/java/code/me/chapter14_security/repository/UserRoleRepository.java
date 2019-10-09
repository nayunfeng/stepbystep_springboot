package code.me.chapter14_security.repository;

import code.me.chapter14_security.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author nayunfeng
 * @date 2019/10/9 14:49
 * @description
 */
public interface UserRoleRepository extends JpaRepository<UserRole,String> {
    List<UserRole> findByUserId(String userId);
}
