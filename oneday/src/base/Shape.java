package base;

public abstract class Shape {
    protected String color;
    public Shape(String color) {
        this.color = color;
    }

    // 抽象方法: 没有方法体
    public abstract double area(); // abstract 关键字, 表示这是一个抽象方法。它只有声明，没有实现, 拥有抽象方法的类必须声明为抽象类（abstract class）
    /*
    没有 {} 方法体
    直接以分号结束，所以你不能直接调用它。必须有一个具体的子类去重写（覆盖）它，并给出真正的计算逻辑。
    public
    通常会被设为 public，因为这个方法就是拿来给外界调用的。也可以根据情况用 protected，但不能用 private（因为 private 方法不能被重写，和 abstract 矛盾）。
    */
    // 普通方法
    public void display() {
        System.out.println("这是一个" + color + " 的图形, 面积为: " + area());
    }
}
