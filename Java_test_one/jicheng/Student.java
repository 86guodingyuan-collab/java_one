package jicheng;

public class Student extends Person {
    private String studentId;
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    // 子类特有行为
    public void study() {
        System.out.println(getName() + "正在学习Java.");
        // 因为 name 是父类的私有属性, 子类不能直接用 name, 必须用 getName() 
    }
}
