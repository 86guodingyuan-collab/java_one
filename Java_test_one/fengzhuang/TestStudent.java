package fengzhuang;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        // 3. 现在只能通过 setter 方法赋值
        stu.setName("小赵");
        stu.setAge(22);
        stu.setHeight(1.65);

        stu.introduce();

        // 4. 测试传入非法数据
        stu.setAge(-10);
        System.out.println("看看年龄有没有变成-10? 现在的年龄是: " + stu.getAge());
    }
}
