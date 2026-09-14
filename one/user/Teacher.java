
package one.user;

public class Teacher extends User {

    // 子类构造器：把参数传给父类构造器
    public Teacher(String name, int age, String id) {
        super(name, age, id);
    }

    // 子类独特方法
    public void sayTeacher() {
        System.out.println("我是教师, 我的名字是" + getName()
                + " 我 " + getAge() + " 岁了. 我的工号是 " + getId() + ".");
    }
}
