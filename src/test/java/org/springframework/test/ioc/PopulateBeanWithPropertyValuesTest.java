package org.springframework.test.ioc;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.PropertyValue;
import org.springframework.beans.factory.PropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.test.bean.Person;
import static org.assertj.core.api.Assertions.assertThat;
/**
 * @author xiaou
 * @date 2024/1/24
 */
public class PopulateBeanWithPropertyValuesTest {
    @Test
    public void testPopulateBeanWithPropertyValues() throws Exception {

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "xiaou"));
        propertyValues.addPropertyValue(new PropertyValue("age", 18));


        BeanDefinition beanDefinition = new BeanDefinition(Person.class, propertyValues);
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerBeanDefinition("person", beanDefinition);
        Person bean = (Person) factory.getBean("person");
        System.out.println(bean);
        assertThat(bean.getName()).isEqualTo("xiaou");
        assertThat(bean.getAge()).isEqualTo(18);
    }
}
