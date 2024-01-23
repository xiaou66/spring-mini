package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaou
 * @date 2024/1/23
 */
public interface BeanFactory {
    /**
     * 获取 bean
     * @param beanName
     * @return
     */
    public Object getBean(String beanName);
}
