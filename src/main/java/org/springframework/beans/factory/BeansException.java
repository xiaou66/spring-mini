package org.springframework.beans.factory;

/**
 * @author xiaou
 * @date 2024/1/23
 */
public class BeansException extends RuntimeException {
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
