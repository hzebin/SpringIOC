package cn.hzebin.ioc.demo3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//增强，用于AOP
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        //初始化前执行的方法
        System.out.println("【第五步】初始化前方法");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(final Object bean, String beanName) throws BeansException {
        //初始化后执行的方法
        System.out.println("【第八步】初始化后方法");

        if("userDao".equals(beanName)) {
            Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if("delete".equals(method.getName())) {
                        System.out.println("给delete方法正在进行增强操作");
                        return method.invoke(bean, args);
                    }
                    return method.invoke(bean, args);  //不是delete方法，不进行增强操作
                }
            });
            return proxy;
        } else {
            return bean;
        }

    }
}
