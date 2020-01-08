package cn.hzebin.demo3;

import javax.annotation.Resource;

public class ProductService {
    @Resource(name = "categoryDao")
    private CategoryDao categoryDao;
    @Resource(name = "productDao")
    private ProductDao productDao;

    public void save() {
        System.out.println("ProductService save()方法执行了");
        categoryDao.save();
        productDao.save();
    }
}
