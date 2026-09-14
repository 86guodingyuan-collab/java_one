package jicheng;
// 1. 定义父类()基础类
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("年龄不合法");
        }
        else {
            this.age = age;
        }
    }
    // 2. 父类的通用行为
    public void eat() {
        System.out.println(name + "想要吃饭");
    }

}
