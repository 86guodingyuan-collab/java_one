package base;

public interface Drawable { // 接口中不能有构造方法，也不能实例化。 interface: 接口。
    // 常量 (默认 public static final)
    String TOOL = "画笔";

    void draw(); // 抽象方法 (默认 public abstract)

    // 默认方法
    default void printTool() {
        System.out.println("使用工具: " + TOOL);
    }
}
// 接口是更高层次的抽象，只定义“能做什么”，不关心怎么做。一个类可以实现多个接口
