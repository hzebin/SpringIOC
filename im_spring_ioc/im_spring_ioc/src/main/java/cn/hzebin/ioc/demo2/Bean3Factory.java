package cn.hzebin.ioc.demo2;

/**
 * Bean的实例化的三种方式
 * 3.实例工厂实例化
 */
public class Bean3Factory {
    public Bean3 createBean3() {
        System.out.println("Bean3Factory方法执行了-----Bean的实例化的三种方法");
        return new Bean3();
    }
}
