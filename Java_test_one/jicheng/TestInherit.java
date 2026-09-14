package jicheng;

public class TestInherit {
    public static void main(String[] args) {
        Student stu = new Student();
        // 调用从父类 Person 继承过来的方法
        stu.setName("小钱");
        stu.setAge(22);
        // 调用自己独有的方法
        stu.setStudentId("232650065");
        stu.eat(); // 继承的
        stu.study(); // 自己的
        System.out.println(stu.getName() + "的学号是: " + stu.getStudentId());

        Teacher tea = new Teacher();
        tea.setName("小孙");
        tea.setAge(35);
        tea.setSalary(6500);

        tea.eat();
        tea.teach();
    }
}
/*
extends 关键字: 在写类定义时, 表示继承自谁
public class Student extends Person (表示 Student 继承 Person类)

私有属性的访问：即使子类继承了父类，也不能直接访问父类的 private 属性
（比如在 Student 里直接写 name 会报错），必须通过父类提供的 public 的 getter/setter 来访问

代码复用：有了继承，以后你要写 Teacher 类，只需 class Teacher extends Person，
然后再加个 salary（工资）属性就行了，不用再写一遍姓名和年龄。


*/
