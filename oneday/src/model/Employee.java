package model;
import base.Payable;
import java.util.Objects;

// 继承: Person 是父类, Employee 是子类
// 子类构造器第一行必须调用 super，要么显式，要么隐含无参
public class Employee extends Person implements Payable {
    private final String employeeId;
    private double salary; // 工资

    public Employee(String name, int age, String employeeId, double salary) {
        super(name, age); // 调用父类构造器
        this.employeeId = employeeId;
        setSalary(salary);
    }

    public String getEmployeeId() {
        return employeeId;
    }
    //使用了 final 修饰，不可变字段, 所以没有 setEmployeeId 方法
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary < 0 ) {
            throw new IllegalArgumentException("工资不能为负数");
        }
        this.salary = salary;
    }

    // 重写父类方法
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false; // 调用父类 equals 方法
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(employeeId, employee.employeeId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeId, salary);
    }

    @Override
    public double calculatePay() {
        return getSalary() * 0.8; // 假设发 80% 的工资
    }
}
/*
使用 @Override 注解明确重写，编译器可帮你检查错误。
子类 toString 里通过 getName() 获取父类私有字段（不能直接 name，因为 private）。
如果父类没有无参构造器，子类必须显式调用 super(参数)。
不要在构造器中调用可被重写的方法（这里没犯），否则子类重写后可能导致未初始化的字段被访问。
*/
