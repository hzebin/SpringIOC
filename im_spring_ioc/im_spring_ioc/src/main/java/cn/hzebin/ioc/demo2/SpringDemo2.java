package cn.hzebin.ioc.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean实例化的三种方式
 */
public class SpringDemo2 {

    @Test
    /**
     * 1.采用无参数的构造方法的方式，一般会使用这种方式
     */
    public void demo1() {
        //创建工厂,配置文件里面的全部内容都会被实例化!!
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类的实例
        Bean1 bean1 = (Bean1)applicationContext.getBean("bean1");
    }

    @Test
    /**
     * 2.静态工厂的实例化方式
     */
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
    }

    @Test
    /**
     * 3.实例工厂实例化
     */
    public void demo3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean3 bean3 = (Bean3)applicationContext.getBean("bean3");
    }
}
