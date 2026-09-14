package model;
import java.util.Objects;
public class Person {
    // 人, 模型类
    // 习惯: 字段私有, 提供 getter，慎用 setter（不可变优先）
    private final String name; // final：一旦赋值不能修改（不可变对象更安全)
    // 所以没有: public void setName(String name) { this.name = name; }
    private int age; // // 年龄可变，但通过方法控制
    // 无参构造 （提供默认值）
    public Person() {
        this("未命名", 0);
    }
    // 主要构造器
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // 复用校验逻辑
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("年龄必须在 0-150 岁之间");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // 重写 equals 和 hashCode 方法，确保对象相等性(对象比较用)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // 默认: 相同名字和相同年龄为同一人

    // 业务方法
    public boolean isAdult() {
        return age >= 18; 
    }

    // 在 Person 中添加静态内部 Builder
    public static class Builder {
        private String name;
        private int age;

        public Builder name(String name) {this.name = name; return this;}
        public Builder age(int age) {this.age = age; return this;}
        public Person build() {
            return new Person(name, age);
        }
    }
    // 使用: Person p = new Person.Builder().name("张三").age(25).build();

}
/*
name 使用 final，创建后不可改，避免副作用
构造器中调用 setAge()，避免重复校验代码
如果字段可变，提供 setXxx 方法时必须做防御性校验
永远不要直接暴露字段为 public
重写 equals 时必须重写 hashCode（HashMap 等集合依赖它）
*/
