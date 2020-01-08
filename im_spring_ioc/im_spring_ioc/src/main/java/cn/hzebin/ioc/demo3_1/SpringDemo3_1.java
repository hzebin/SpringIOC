package cn.hzebin.ioc.demo3_1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo3_1 {
    @Test
    /**
     * spring方法增强
     */
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.add();
        userDao.delete();
        userDao.modify();
        userDao.search();
    }
}
