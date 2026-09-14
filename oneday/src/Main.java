import base.Animal;
import base.Shape;
import model.Car;
import model.Cat;
import model.Circle;
import model.Dog;
import model.Employee;
import model.Rectangle;
import service.PayrollService;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("旺财"),
            new Cat("咪咪")
        };

        // 多态的使用
        for (Animal a : animals) {
            a.speak(); // 动态绑定，执行实际子类的 speak
            // a.wagTail();   // 编译错误！Animal 中没有 wagTail
            if (a instanceof Dog) { // 向下转型前必须判断类型
                ((Dog) a).wagTail();
            }
        }

        Shape s = new Circle("红色", 5);
        s.display();

        Shape s1 = new Rectangle("蓝色", 10, 20);
        s1.display();

        Car.Engine v8 = new Car.Engine(400);
        Car bmw = new Car("BMW", v8);
        bmw.startCar();

        System.out.println("-----测试-----"); // 测试多态, 接口
        Employee e1 = new Employee("王工", 30, "E001", 15000);
        System.out.println(e1);

        PayrollService service = new PayrollService();
        service.addEmployee(e1);
        service.addEmployee(new Employee("赵工", 28, "E002", 12500));
        service.printPayroll();
        // 测试组合
        Car.Engine engine = new Car.Engine(250);
        Car car = new Car("Tesla", engine);
        car.startCar();

    }
}
/*
多态的前提：继承 + 方法重写 + 父类引用指向子类对象。
编译看左边，运行看右边。
向下转型（强转）有风险，先用 instanceof 判断。
实际开发中，经常用 List<Animal> 或 Animal[] 来统一操作不同子类。
*/