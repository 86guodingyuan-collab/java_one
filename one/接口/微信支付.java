package one.接口;

public class 微信支付 implements 支付策略 {
    @Override
    public void pay(double amount) {
        System.out.println("使用微信支付了" + amount + "元.");
    }
}
