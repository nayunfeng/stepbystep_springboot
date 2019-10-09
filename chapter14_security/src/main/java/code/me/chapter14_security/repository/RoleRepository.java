package code.me.chapter14_security.repository;

import code.me.chapter14_security.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nayunfeng
 * @date 2019/10/9 14:49
 * @description
 */
public interface RoleRepository extends JpaRepository<Role,String> {

}
