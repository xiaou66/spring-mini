package org.springframework.beans.factory.config;

/**
 * BeanDefinition 实例保存 bean 的信息，包括 class 类型、方法构造参数、是否为单例等，此处简化只包含 class 类型
 * @author xiaou
 * @date 2024/1/23
 */
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
