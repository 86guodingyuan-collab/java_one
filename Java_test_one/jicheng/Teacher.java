package jicheng;

public class Teacher extends Person{
    private double salary;
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("工资不能为负数");
        }
        else {
            this.salary = salary;
        }
    }

    public void teach() {
        System.out.println(getName() + "正在教书, 月薪是" + getSalary() + "元.");
    }
}
