package code.me.chapter14_security.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author nayunfeng
 * @date 2019/10/9 14:46
 * @description 角色类
 */
@Data
@Table(name = "role")
@Entity
public class Role {
    @Id
    private String id;
    private String name;
}
