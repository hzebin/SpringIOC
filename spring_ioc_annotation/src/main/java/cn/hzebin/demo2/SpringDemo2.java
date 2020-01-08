package cn.hzebin.demo2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {
    @Test
    /**
     * 创建和销毁Bean的注解
     */
    public void demo1() {
        //执行了init方法，因为
        //加载了applicationContext.xml配置文件，交给spring管理的Bean都会被初始化！！！
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
        bean1.say();
        applicationContext.close();  //第十二行的ClassPathXmlApplicationContext实现类才可以.close()
    }

    @Test
    /**
     * Bean的作用范围
     */
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean2 beanA = (Bean2) applicationContext.getBean("bean2");
        Bean2 beanB = (Bean2) applicationContext.getBean("bean2");
        //默认为单例
        System.out.println(beanA);
        System.out.println(beanB);
    }
}
