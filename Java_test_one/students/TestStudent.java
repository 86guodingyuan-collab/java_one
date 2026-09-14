package students;

public class TestStudent {
    public static void main(String[] args) {
        // 根据Student类创建对象，对象名小驼峰
        Student stu = new Student(); 
        
        stu.name = "小明";
        stu.age = 22;
        stu.height = 1.76;
        
        stu.introduce();
        stu.speak("Man! What Can I Say?");
    }
}
/*
在Java中，类名通常就是一个名词，代表一类事物。所以包含属性和方法的类，最合适的名字就是 Student。
student（包含main方法的类）只是用来测试/运行 Student 的，通常叫 TestStudent 或 Main。

类名：应该使用 大驼峰命名法，即每个单词首字母大写。比如 Student

方法名和变量名：应该使用 小驼峰命名法，即第一个单词首字母小写，后面单词首字母大写。比如 introduceYou

包名：全部小写，比如 students
*/