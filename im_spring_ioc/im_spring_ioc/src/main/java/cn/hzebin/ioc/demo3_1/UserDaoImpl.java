package cn.hzebin.ioc.demo3_1;

public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("执行了 增加 操作");
    }

    @Override
    public void delete() {
        System.out.println("执行了 删除 操作");
    }

    @Override
    public void modify() {
        System.out.println("执行了 修改 操作");
    }

    @Override
    public void search() {
        System.out.println("执行了 查询 操作");
    }
}
