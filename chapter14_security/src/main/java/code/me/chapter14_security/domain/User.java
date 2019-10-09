package code.me.chapter14_security.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author nayunfeng
 * @date 2019/10/9 14:45
 * @description 用户类
 */
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    private String id;
    private String username;
    private String password;
}
