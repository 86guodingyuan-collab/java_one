package fengzhuang;

public class Student {
    // 1. 属性私有化：外部不能再直接 stu.age = -1000 了
    private String name;
    private int age;
    private double height;

    // 2. public 的 getter 和 setter 方法
    /**
     * 获取学生年龄
     *
     * @return 年龄值
     */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("年龄不合法，请重新输入.");
        }
        else {
            this.age = age;
            // this.age 代表类里的属性，age 代表传进来的参数
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("名字不合法, 请重新输入");
        }
        else {
            this.name = name;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0.1 || height > 2.5) {
            System.out.println("身高不合法, 请重新输入");
        }
        else {
            this.height = height;
        }
    }

    public void introduce() {
        System.out.println("大家好, 我是" + name + ", 我今年" + age + "岁, 我的身高是" + height + "米.");
    }
}
