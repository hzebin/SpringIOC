package cn.hzebin.demo3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * XML与注解整合开发
 */
public class SpringDemo3 {
    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        ProductService productService = (ProductService) applicationContext.getBean("productService");
        productService.save();
    }
}
