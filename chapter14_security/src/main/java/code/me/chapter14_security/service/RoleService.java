package code.me.chapter14_security.service;

import code.me.chapter14_security.domain.Role;

/**
 * @author nayunfeng
 * @date 2019/10/9 15:21
 * @description
 */
public interface RoleService {

    Role findById(String id);
}
