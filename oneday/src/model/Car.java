package model;

public class Car {
    private final Engine engine; // 组合关系，Car 拥有 Engine
    private String model;

    // 静态内部类 Engine (与 Car 紧密相关, 但可以独立存在)
    public static class Engine {
        private int horsepower; // 马力

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }
        public void start() {
            System.out.println(horsepower + " 马力的引擎启动...");
        }
    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        System.out.print(model + "汽车: ");
        engine.start();
    }
}
/*
内部类使用场景：
辅助类只被外部类使用，不想单独新建文件。
静态内部类（推荐）：不依赖外部实例，比如 Builder 模式，内存泄漏风险低。
成员内部类：可以访问外部类成员，但持有外部引用，小心内存泄漏。
*/
/*
Builder 模式例子（常用）：
// 在 Person 中添加静态内部 Builder
public static class Builder {
    private String name;
    private int age;

    public Builder name(String name) { this.name = name; return this; }
    public Builder age(int age) { this.age = age; return this; }
    public Person build() {
        return new Person(name, age);
    }
}
// 使用：Person p = new Person.Builder().name("张三").age(25).build();
*/
