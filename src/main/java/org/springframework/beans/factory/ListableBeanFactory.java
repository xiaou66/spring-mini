package org.springframework.beans.factory;

import cn.hutool.core.bean.BeanException;

import java.util.Map;

public interface ListableBeanFactory extends BeanFactory {

    /**
     * 返回指定类型的所有实例
     * @param type
     * @return
     * @param <T>
     * @throws BeansException
     */
    <T>Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回定义的所有 bean 名称
     * @return
     */
    String[] getBeanDefinitionNames();
}
