package code.me.chapter14_security.service.impl;

import code.me.chapter14_security.domain.Role;
import code.me.chapter14_security.repository.RoleRepository;
import code.me.chapter14_security.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author nayunfeng
 * @date 2019/10/9 15:22
 * @description
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public Role findById(String id) {
        Optional<Role> optional = roleRepository.findById(id);
        return optional.orElse(null);
    }
}
