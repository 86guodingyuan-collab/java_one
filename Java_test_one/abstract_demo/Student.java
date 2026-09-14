package abstract_demo;

public class Student extends Person {
    @Override
    public void work() {
        System.out.println("我是" + getName() + ",我认为学习也是一种工作");
    }
    @Override
    public void sayHello() {
        System.out.println("我是" + getName() + "，是一名学生");
    }
    public void study() {
        System.out.println(getName() + "在学习");
    }

    private String studentId;
    public String getStudentId() {return studentId;}
    public void setStudentId(String studentId) {this.studentId = studentId;}

    
    
}
