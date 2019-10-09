package code.me.chapter12_exception_retry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
// 开启重试
@EnableRetry
public class Chapter12ExceptionRetryApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chapter12ExceptionRetryApplication.class, args);
    }

}
