package interface_demo;

public class Teacher extends Person implements Swimable {
    @Override
    public void swim() {
        System.out.println(getName() + "老师学会了新的技能: 游泳, 并且最大有用距离为" + MAX_RANGE + "米");
    }
    @Override
    public void work() {
        System.out.println(getName() + "学会了游泳技能, 所以他是一名游泳老师");
    }

    private double salary;
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
