package abstract_demo;
// 1. 用 abstract 修饰, 表示这是一个抽象类
public abstract  class Person {
    private String name;
    private int age;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    // 2. 抽象方法, 没有方法体, 用 abstract 修饰
    // 所有子类必须重写这个方法

    public abstract void work();

    // 3. 普通方法, 抽象类也可以有普通方法
    public abstract  void sayHello();
}
