package duotai;

public class TestPolymorphism 
{
    public static void main(String[] args) 
    {
        // 正常写法
        Student stu = new Student();
        stu.setName("小李");
        stu.work();

        // 多态写法
        Person p1 = new Student();
        p1.setName("小周");
        p1.work(); // 执行的是 Student 的 work

        Person p2 = new Teacher();
        p2.setName("小吴");
        p2.work();

        /*
        【多态最强大的应用：统一参数类型】
        假设我们有一个方法，需要让所有人开始工作
        如果没有多态，你需要写 makeStudentWork(Student s) 和 makeTeacherWork(Teacher t)
        有了多态，只需要一个方法，参数写父类即可！
        */
        makeWork(p1);
        makeWork(p2);
        // 传匿名对象
        makeWork(new Student());
        // null是学生, 正在努力学习

        Person p3 = new Student();
        Person p4 = new Teacher();

        p3.setName("小郑");
        p4.setName("小王");

        makeSay(p3);
        makeSay(p4);

        Person p5 = new Student();
        p5.setName("小冯");
        Student s = (Student) p5; // 向下转型，需要强制转换
        s.study();

        
    }
    // 这个方法接收 Person 类型，但传入 Student 或 Teacher 都可以
    public static void makeWork(Person p) 
    {
        p.work();
    }
    
    public static void makeSay(Person p)
    {
        p.sayHello();
    }
}

