package PHONE;
// 1.定义一个类, 描述这个东西有哪些属性和行为(图纸)
public class Phone{
    String brand;
    double price;
    public void call(String who){
        System.out.println("正在用" + brand + "手机给" + who + "打电话");
    }
    public void showInfo(){
        System.out.println("这是一台" + brand + "手机, 价格为" + price + "元");
    }
}