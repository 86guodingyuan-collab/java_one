package one;
public class App {
    public static void main(String[] args) throws Exception {
        int age = 22;
        double height = 175.23;
        float weight = 55.43f;
        long phoneNumber = 15120872846L;
        String name = "郭丁远";
        char classRoom = 'A';
        boolean isMale = true;

        System.out.println("姓名:" + name + ", 年龄: " + age + ", 身高: " + height
         + ", 体重: " + weight + ", 是否为男性: " + isMale + ", 班级: " + classRoom);
        System.out.println("电话号码: " + phoneNumber);

        // 三目运算:
        int a = 10; int b = 20;
        System.out.println((a > b) ? "a大于b" : "a小于b");
    }
}
/*
JavaOOPDemo/                   （项目根目录）
├── src/                       （源代码）
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── yourcompany/
│   │               ├── model/          // 实体类、数据模型
│   │               │   ├── Person.java
│   │               │   ├── Student.java
│   │               │   └── Animal.java
│   │               ├── service/        // 业务逻辑
│   │               │   ├── StudentService.java
│   │               │   └── AnimalService.java
│   │               └── Main.java       // 程序入口
│   └── test/                           // 测试代码（后续学习）
└── README.md
*/