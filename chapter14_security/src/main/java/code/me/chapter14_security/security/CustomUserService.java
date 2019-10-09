package code.me.chapter14_security.security;

import code.me.chapter14_security.domain.Role;
import code.me.chapter14_security.domain.User;
import code.me.chapter14_security.domain.UserRole;
import code.me.chapter14_security.error.BusinessException;
import code.me.chapter14_security.service.RoleService;
import code.me.chapter14_security.service.UserRoleService;
import code.me.chapter14_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nayunfeng
 * @date 2019/10/9 15:20
 * @description
 */
@Component
public class CustomUserService implements UserDetailsService {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private UserRoleService userRoleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByUsername(username);
        if (user == null) {
            throw new BusinessException("用户不存在");
        }
        // 获取用户所关联的角色
        List<UserRole> userRoleList = userRoleService.findByUserId(user.getId());
        List<GrantedAuthority> authorityList = new ArrayList<>();
        for (UserRole userRole : userRoleList) {
            // 获取用户关联角色名称
            Role role = roleService.findById(userRole.getId());
            authorityList.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorityList);
    }
}
