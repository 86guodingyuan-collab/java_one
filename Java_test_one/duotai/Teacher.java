package duotai;

public class Teacher extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0 ) {
            System.out.println("工资不能为负数");
        }
        else {
            this.salary = salary;
        }
    }
    @Override
    public void work() {
        System.out.println(getName() + "是老师, 正在努力教学.");
    }
    @Override
    public void sayHello() {
        System.out.println("同学们好, 我是" + getName() + "老师.");
    }
}
