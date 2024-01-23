package org.springframework.test.ioc;

/**
 * @author xiaou
 * @date 2024/1/23
 */
public class HelloService {
    public String sayHello() {
        System.out.println("hello");
        return "hello";
    }
}
