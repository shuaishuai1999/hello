package Chapter12.exception;

/**
 * @author shuaishuai
 * @Description
 * @create 2022-04-07 11:15
 */


public class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
