package code.me.chapter14_security.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

/**
 * @author nayunfeng
 * @date 2019/10/9 12:01
 * @description
 */
@Configuration
// 开启Security安全框架
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomUserService userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 路由策略和访问权限的简单配置
        http
                // 启用默认登陆界面
                .formLogin()
                // 登录失败返回url
                .failureUrl("/login?error")
                // 登录成功跳转url
                .defaultSuccessUrl("/user/home")
                // 登录页面全部可访问
                .permitAll();
        super.configure(http);
    }

    /**
     * 配置内存用户
     * @param authenticationManagerBuilder 认证管理建设者
     * @throws Exception e
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(userService);
//        authenticationManagerBuilder.inMemoryAuthentication().getUserDetailsService()
//                .withUser("lily").password("123456").roles("admin")
//                .and().withUser("mike").password("111111").roles("user");
    }
    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }
}
