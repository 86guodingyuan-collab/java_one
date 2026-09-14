package one.user;

public class Test {
    public static void main(String[] args) {
        User user = new User("张三", 25, "001");
        System.out.println("姓名：" + user.getName() + " , 年龄：" + user.getAge());
        user.sayHello();
        System.out.println("---------------------------------");
        Student student = new Student("李四", 20, "002");
        System.out.println("姓名：" + student.getName() + " , 年龄：" + student.getAge());
        student.sayHello();      // 继承自 User 的方法
        student.sayStudent();    // Student 独特方法
        
    }
}
/*
代码块, 静态代码块, 父子类的构造器执行顺序:
1.调用父类静态代码块
2.调用子类静态代码块
3.调用父类代码块
4.调用父类构造器
5.调用子类代码块
6.调用子类构造器
*/