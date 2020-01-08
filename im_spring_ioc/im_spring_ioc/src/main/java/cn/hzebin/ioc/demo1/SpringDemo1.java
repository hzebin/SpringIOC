package cn.hzebin.ioc.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo1 {
    @Test
    /**
     * 传统方法
     */
    public void demo1() {
        UserService userService = new UserServiceImpl();
        userService.sayHello();
    }

    @Test
    /**
     * Spring方式创建
     * IOC DI
     */
    public void demo2() {
        //创建Spring工厂，使用ClassPathXmlApplicationContext加载类路径下的配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类(id)
        UserService userService = (UserService) applicationContext.getBean("userService");
        // 使用
        userService.sayHello();
    }
}
