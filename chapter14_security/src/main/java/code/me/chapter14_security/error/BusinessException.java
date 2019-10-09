package code.me.chapter14_security.error;

/**
 * @author nayunfeng
 * @date 2019/10/9 10:17
 * @description
 */
public class BusinessException extends RuntimeException {
    public BusinessException(){

    }
    public BusinessException(String message){
        super(message);
    }
}
