package code.me.chapter12_exception_retry.retry;

import code.me.chapter12_exception_retry.error.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

/**
 * @author nayunfeng
 * @date 2019/10/9 10:46
 * @description 定义一些重试的方法
 */
@Slf4j
@Component
public class Retry {
    // @Retryable：value属性表示出现哪些异常触发重试，maxAttempts表示最大重试次数，delay表示重试的延迟时间，multiplier表示每次延长时间的倍数
    @Retryable(value = BusinessException.class, maxAttempts = 3, backoff = @Backoff(delay = 3000, multiplier = 2))
    public void retry() {
        log.error("方法失败重试了");
        throw new BusinessException();
    }
}
