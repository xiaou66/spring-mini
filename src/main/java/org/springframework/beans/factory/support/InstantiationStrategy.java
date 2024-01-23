package org.springframework.beans.factory.support;

import org.springframework.beans.factory.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

/**
 * 负责获取 bean 实例 <br/>
 * 这是一种策略，因为各种方法都是可能的，包括使用CGLIB动态创建子类以支持方法注入。
 * @author xiaou
 * @date 2024/1/23
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
