package one.user;

public class Student extends User {

    // 子类构造器：把参数传给父类构造器
    public Student(String name, int age, String id) {
        super(name, age, id);
    }

    // 子类独特方法
    public void sayStudent() {
        System.out.println("我是学生, 我的名字是" + getName()
                + " 我 " + getAge() + " 岁了. 我的ID是 " + getId() + ".");
    }
}
