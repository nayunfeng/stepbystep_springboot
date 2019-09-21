package code.me.chapter10_mybatis.domain;

import lombok.Data;

/**
 * @author nayunfeng
 * @date 2019/9/21 11:19
 * @description
 */
@Data
public class Site {
    private Integer id;
    private String domain;
    private String email;
    private String username;
    private String password;
}
