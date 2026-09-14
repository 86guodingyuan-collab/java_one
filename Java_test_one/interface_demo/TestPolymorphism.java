package interface_demo;

public class TestPolymorphism {
    public static void main(String[] args) {
        Person p1 = new Student();
        Person p2 = new Teacher();

        p1.setName("小魏");
        p2.setName("小蒋");

        makeWork(p1);
        Student s = (Student) p1;
        s.fly();
        makeWork(p2);
        ((Teacher) p2).swim();

        Flyable f = new Student();
        Student s1 = (Student) f;
        s1.setName("小沈");
        s1.fly();

        SuperStudent s2 = new SuperStudent();
        s2.setName("小韩");
        s2.fly();
        makeSwim(s2);
        
    }
    public static void makeWork(Person p) {
        p.work();
    }
    public static void makeFly(Flyable f) {
        f.fly();
    }
    public static void makeSwim(Swimable s) {
        s.swim();
    }
}