package cn.hzebin.ioc.demo2;

/**
 * Bean的实例化的三种方式
 * 2.静态工厂实例化方式
 */
public class Bean2Factory {

    /**
     * 静态方法
     */
    public static Bean2 createBean2() {
        System.out.println("静态工厂的实例化方式");
        return new Bean2();
    }
}
