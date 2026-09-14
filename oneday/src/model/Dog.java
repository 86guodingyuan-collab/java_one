package model;
import base.Animal;
public class Dog extends Animal {
    public Dog(String name) {
        super(name); // 调用父类构造器
    }

    @Override
    public void speak() {
        System.out.println(name + "汪汪叫!");
    }

    public void wagTail() {
        System.out.println(name + "摇尾巴~");
    }
}
