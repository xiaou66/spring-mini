package org.springframework.beans.factory.config;


/**
 * @author xiaou
 * @date 2024/1/23
 */
public interface SingletonBeanRegistry {
    /**
     * 获取实例
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

    void addSingleton(String beanName, Object singletonObject);
}
