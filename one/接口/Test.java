package one.接口;

public class Test {
    public static void main(String[] args) {
        支付上下文 ctrx1 = new 支付上下文(new 支付宝());
        ctrx1.executePayment(10.25);
        支付上下文 ctrx2 = new 支付上下文(new 微信支付());
        ctrx2.executePayment(100);
    }
}
// 提升程序的拓展性