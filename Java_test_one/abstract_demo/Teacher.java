package abstract_demo;

public class Teacher extends Person {
    @Override
    public void work() {
        System.out.println("我是" + getName() + "我的工作就是教学");
    }
    @Override
    public void sayHello() {
        System.out.println("我是" + getName() + ",是一名老师");
    }

    public void teach() {
        System.out.println("我是" + getName() + ",我现在正在给学生上课");
    }

    private double salary;
    public double getSalary() {return salary;}
    public void setSalary(double salary) {this.salary = salary;}
}
