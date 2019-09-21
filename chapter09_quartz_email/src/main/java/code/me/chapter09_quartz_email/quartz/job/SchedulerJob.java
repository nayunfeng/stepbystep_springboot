package code.me.chapter09_quartz_email.quartz.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author nayunfeng
 * @date 2019/9/21 9:54
 * @description
 */
@Component
// 作用相当于XML文件，可以被Spring Boot扫描初始化
//@Configurable
// 开启对计划任务的支持
//@EnableScheduling
public class SchedulerJob {

    @Scheduled(cron = "*/5 * * * * ?")
    public void run() {
        System.out.println("定时任务执行了");
    }
}
