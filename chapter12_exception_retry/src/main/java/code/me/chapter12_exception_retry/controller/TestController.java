package code.me.chapter12_exception_retry.controller;

import code.me.chapter12_exception_retry.error.BusinessException;
import code.me.chapter12_exception_retry.retry.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nayunfeng
 * @date 2019/10/9 10:28
 * @description
 */
@RestController
public class TestController {

    @RequestMapping("/findAll")
    public void findAll() {
        throw new BusinessException("业务异常");
    }

    @Autowired
    private Retry retry;

    @RequestMapping("/retry")
    public void retry() {
        retry.retry();
    }
}
