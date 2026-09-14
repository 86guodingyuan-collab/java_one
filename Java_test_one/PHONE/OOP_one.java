package PHONE;
public class OOP_one{
    public static void main(String[] args){
        // 2. 创建对象 (根据图纸造手机)
        Phone myPhone = new Phone();
        // 3. 给对象的属性赋值
        myPhone.brand = "小米";
        myPhone.price = 2999.99;
        // 4. 调用对象的行为(方法)
        myPhone.showInfo();
        myPhone.call("张三");

        Phone sisterPhone = new Phone();
        sisterPhone.brand = "华为";
        sisterPhone.price = 3999.99;
        sisterPhone.showInfo();
        sisterPhone.call("李四");
    }
}
