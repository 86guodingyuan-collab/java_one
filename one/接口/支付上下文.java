package one.接口;
/*
作用：持有一个支付策略对象，并通过 executePayment 方法调用具体的支付策略。
客户端（如测试类）只需要与这个上下文交互，而不需要关心具体使用哪种支付方式。
*/
public class 支付上下文 {
    private 支付策略 strategy;
    /*
    构造方法：注入具体的支付策略
    @param strategy 支付策略对象（如 AlipayStrategy、WechatPayStrategy）
    */
    public 支付上下文(支付策略 strategy) {
        this.strategy = strategy;
    }
    /*
    执行支付操作
    @param amount 支付金额
    */

    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}
