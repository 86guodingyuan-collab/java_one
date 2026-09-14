package collectiondemo;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) { // 使用构造方法快速赋值
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    // 重写 toString 方法, 方便直接打印对象信息
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}