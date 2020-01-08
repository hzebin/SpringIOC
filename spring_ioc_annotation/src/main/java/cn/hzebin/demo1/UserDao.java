package cn.hzebin.demo1;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {
    public void save() {
        System.out.println("Dao层的save方法");
    }
}
