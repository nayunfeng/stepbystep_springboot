package code.me.chapter10_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "code.me.chapter10_mybatis.dao")
@SpringBootApplication
public class Chapter10MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chapter10MybatisApplication.class, args);
    }

}
