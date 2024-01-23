package org.springframework.beans.factory.config;

import org.springframework.beans.factory.PropertyValue;
import org.springframework.beans.factory.PropertyValues;

/**
 * BeanDefinition 实例保存 bean 的信息，包括 class 类型、方法构造参数、是否为单例等，此处简化只包含 class 类型
 * @author xiaou
 * @date 2024/1/23
 */
public class BeanDefinition {
    private Class beanClass;
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this(beanClass, null);
    }
    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
