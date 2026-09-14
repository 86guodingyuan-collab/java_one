package duotai;

public class Student extends Person {
    private String studentId;
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studntId) {
        if (studntId == null || studntId.length() == 0) {
            System.out.println("学号不能为空");
        }
        else {
            this.studentId = studntId;
        }
    }
    public void study() {
        System.out.println(getName() + "正在学习.");
    }
    // 重写方法: 子类对父类的方法进行重新实现
    // 加上 @Override 注释, 告诉编译器我实在重写父类方法
    @Override
    public void work() {
        System.out.println(getName() + "是学生, 正在努力学习");
    }
    @Override
    public void sayHello() {
        System.out.println("老师好, 我叫" + getName() + ".");
    }
    
}
