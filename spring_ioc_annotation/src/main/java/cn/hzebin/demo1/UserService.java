package cn.hzebin.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Spring注解配置方式注入
 * 1.传统方式<bean id="" class=""/>
 * 2.添加注解方式
 */

@Service("userService")
public class UserService {

    //如果有set方法，注解写在set方法上。如果没有set方法，写在属性上
    @Value("米饭") //不用set方法
    private String food;

//    @Autowired
//    @Qualifier("userDao")
    @Resource(name = "userDao")
    private UserDao userDao;

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public void eat() {
        System.out.println("eat " + food);
    }

    public void save() {
        System.out.println("Service层的save方法");
        userDao.save();
    }
}
