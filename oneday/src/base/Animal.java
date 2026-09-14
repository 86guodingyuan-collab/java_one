package base;

//  多态（向上转型、动态绑定）
// 多态是 OOP 的核心威力：父类引用指向子类对象，调用方法时执行子类实现。
public class Animal {
    protected String name; // 受保护的成员变量，子类可以访问
    // 构造器
    public Animal(String name) { 
        this.name = name; 
    }

    public void speak() {
        System.out.println(name + "发出某种声音......");
    }
}
