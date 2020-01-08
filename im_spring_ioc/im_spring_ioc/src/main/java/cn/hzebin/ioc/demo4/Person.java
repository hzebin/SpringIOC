package cn.hzebin.ioc.demo4;

public class Person {
    //字段属性
    private String name;
    private Integer age;
    //对象属性
    private Cat cat;

    public Person() {
    }

    public Person(String name, Integer age, Cat cat) {
        this.name = name;
        this.age = age;
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cat=" + cat +
                '}';
    }
}
