package students; // 包名全小写

// 类名大驼峰，代表学生这类事物
public class Student {
    // 属性名小驼峰
    String name;
    int age;
    double height;
    
    // 方法名小驼峰，拼写纠正为 introduce
    public void introduce() {
        System.out.println("我是" + name + ", 今年" + age + "岁, 我的身高是" + height + "米");
    }
    
    // 方法名小驼峰，拼写纠正为 speak
    public void speak(String words) { // 参数名也用小驼峰，what也可以，words更语义化
        System.out.println("我想说的是:" + words);
    }
}
