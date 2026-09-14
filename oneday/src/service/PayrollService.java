package service;
import model.Employee;
import java.util.ArrayList;
import java.util.List;
public class PayrollService {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void printPayroll() {
        System.out.println("---工资单---");
        for (Employee e : employees) {
            System.out.printf("%s 实发: %.2f%n",e.getName(), e.calculatePay());
        }
    }
}
