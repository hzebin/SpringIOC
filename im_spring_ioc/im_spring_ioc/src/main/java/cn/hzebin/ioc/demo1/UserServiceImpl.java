package cn.hzebin.ioc.demo1;

public class UserServiceImpl implements UserService {
    private String name;

    public void sayHello() {
        System.out.println("Hello SpringIOC " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
