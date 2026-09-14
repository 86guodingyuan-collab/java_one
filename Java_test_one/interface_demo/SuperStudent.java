package interface_demo;

public class SuperStudent extends Person implements Flyable , Swimable {
    @Override
    public void work() {
        System.out.println(getName() + "是超人, 既会飞又会游泳");
    }
    @Override
    public void fly() {
        System.out.println(getName() + "获得了会飞的超能力, 飞行最大高度为: " + MAX_ALTITUDE + "米");
    }
    @Override
    public void swim() {
        System.out.println(getName() + "获得了会游泳的超能力, 潜水深度为: " + MAX_RANGE + "米");
    }

    private String studentId;
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
