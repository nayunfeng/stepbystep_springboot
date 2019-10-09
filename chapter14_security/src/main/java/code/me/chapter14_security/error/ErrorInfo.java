package code.me.chapter14_security.error;

import lombok.Data;

/**
 * @author nayunfeng
 * @date 2019/10/9 10:21
 * @description
 */
@Data
public class ErrorInfo<T> {
    public static final Integer SUCCESS = 200;
    public static final Integer ERROR = 100;
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 错误信息
     */
    private String message;
    /**
     * 访问路径
     */
    private String url;
    private T data;
}
