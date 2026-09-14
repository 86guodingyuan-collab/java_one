package interface_demo;

public class Student extends Person implements Flyable {
    @Override
    public void fly() {
        System.out.println("学生" + getName() + "获得了会飞的超能力, 飞行最大高度为: " + MAX_ALTITUDE + "米");
    }
    @Override
    public void work() {
        System.out.println("学生" + getName() + "因获得了超能力, 所以不用上课了");
    }
    private String studentId;
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
