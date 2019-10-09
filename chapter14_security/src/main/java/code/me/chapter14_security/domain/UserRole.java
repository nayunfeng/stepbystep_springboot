package code.me.chapter14_security.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author nayunfeng
 * @date 2019/10/9 14:47
 * @description 用户角色关联类
 */
@Data
@Entity
@Table(name = "user_role")
public class UserRole {
    @Id
    private String id;
    private String userId;
    private String roleId;
}
