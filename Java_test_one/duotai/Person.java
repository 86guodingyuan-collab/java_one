package duotai;

public class Person {
    // 属性
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            System.out.println("姓名不能为空");
        }
        else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 120 || age < 0) {
            System.out.println("年龄不合法");
        }
        else {
            this.age = age;
        }
    }

    // 父类定义一个通用行为
    public void work() {
        System.out.println(getName() + "正在工作.");
    }

    public void sayHello() {
        System.out.println("你好, 我在向你打招呼.");
    }
}
