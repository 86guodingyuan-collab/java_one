package interface_demo;
// 1. 定义一个接口，名为Flyable
public interface Flyable {
    // 接口里的方法默认是 public abstract , 可以省类
    void fly();
    // 接口里的属性默认是 public static final , 常量
    int MAX_ALTITUDE = 10000; // 最大飞行高度
}