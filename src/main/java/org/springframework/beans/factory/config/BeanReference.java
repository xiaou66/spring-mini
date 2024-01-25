package org.springframework.beans.factory.config;

/**
 * @author xiaou
 * @date 2024/1/25
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
