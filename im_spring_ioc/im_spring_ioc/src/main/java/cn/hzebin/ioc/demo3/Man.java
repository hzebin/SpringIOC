package cn.hzebin.ioc.demo3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Man implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("【步骤二】设置属性");
        this.name = name;
    }

    public Man() {
        System.out.println("【步骤一】MAN被实例化了");
    }

    public void setup() {
        System.out.println("【第七步】MAN被初始化了");
    }

    public void teardown() {
        System.out.println("【第十一步】执行用户写的销毁方法 MAN被销毁了");
    }

    @Override
    public void setBeanName(String s) {
        //implements BeanNameAware
        System.out.println("【第三步】设置Bean的名称，就是Bean的id" + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        //implements BeanFactoryAware
        System.out.println("【第四步】了解工厂的信息");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //implements InitializingBean
        System.out.println("【第六步】属性设置后");
    }

    public void run() {
        System.out.println("【第九步】执行业务方法");
    }

    @Override
    public void destroy() throws Exception {
        //implements DisposableBean
        System.out.println("【第十步】执行Spring的销毁方法");
    }
}
