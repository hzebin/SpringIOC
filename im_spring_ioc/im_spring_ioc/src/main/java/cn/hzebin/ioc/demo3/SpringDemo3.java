package cn.hzebin.ioc.demo3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的作用域测试
 */
public class SpringDemo3 {
    @Test
    /**
     * 默认情况下单例 singleton
     */
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person1 = (Person) applicationContext.getBean("person");
        Person person2 = (Person) applicationContext.getBean("person");

        //他们的地址是相同的，因为是单例
        System.out.println(person1);
        System.out.println(person2);
    }

    @Test
    /**
     * Bean的生命周期
     */
    public void demo2() {
        //ApplicationContext是接口没有销毁，ClassPathXmlApplicationContext实现类才有
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Man man = (Man) applicationContext.getBean("man");
        man.run();
        //关闭工厂-》销毁
        applicationContext.close();
    }
}
