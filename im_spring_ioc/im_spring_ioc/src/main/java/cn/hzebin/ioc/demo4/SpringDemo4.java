package cn.hzebin.ioc.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo4 {
    @Test
    /**
     * Spring的属性注入--构造方法注入
     */
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }

    @Test
    /**
     * Spring的属性注入--set方法注入
     */
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }

    @Test
    /**
     * Spring的属性注入--p名称空间
     */
    public void demo3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }

    @Test
    /**
     * Spring的属性注入--SpEL注入
     */
    public void demo4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Product product = (Product) applicationContext.getBean("product");
        System.out.println(product);
    }
}
