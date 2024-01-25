package org.springframework.test.ioc;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.PropertyValue;
import org.springframework.beans.factory.PropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanReference;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.test.bean.Car;
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

    @Test
    public void testPopulateBeanWithBean() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        PropertyValues propertyValuesForCar = new PropertyValues();
        propertyValuesForCar.addPropertyValue(new PropertyValue("brand", "porsche"));
        BeanDefinition carBeanDefinition = new BeanDefinition(Car.class, propertyValuesForCar);
        beanFactory.registerBeanDefinition("car", carBeanDefinition);

        // 注册 Person 实例
        PropertyValues propertyValuesForPerson = new PropertyValues();
        propertyValuesForPerson.addPropertyValue(new PropertyValue("name", "derek"));
        propertyValuesForPerson.addPropertyValue(new PropertyValue("age", 18));

        // Person 实例依赖 Car 实例
        propertyValuesForPerson.addPropertyValue(new PropertyValue("car", new BeanReference("car")));
        BeanDefinition beanDefinition = new BeanDefinition(Person.class, propertyValuesForPerson);
        beanFactory.registerBeanDefinition("person", beanDefinition);

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
        assertThat(person.getName()).isEqualTo("derek");
        assertThat(person.getAge()).isEqualTo(18);
        Car car = person.getCar();
        assertThat(car).isNotNull();
        assertThat(car.getBrand()).isEqualTo("porsche");
    }
}
