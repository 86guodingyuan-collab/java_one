package one.接口;

public class 支付宝 implements 支付策略 {
    @Override
    public void pay(double amount) {
        System.out.println("使用支付宝支付了" + amount + "元.");
    }
}
/*
class 类名 implements 接口名 {
    // 实现接口中的所有抽象方法
}

在 Java 中，implements 是一个关键字，用于让一个类实现一个或多个接口。
实现接口意味着该类必须提供接口中声明的所有抽象方法的具体实现（除非该类被声明为抽象类）。
*/
