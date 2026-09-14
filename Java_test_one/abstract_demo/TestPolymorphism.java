package abstract_demo;

public class TestPolymorphism {
    public static void main(String[] args) {
        Person p1 = new Student();
        Person p2 = new Teacher();

        p1.setName("小陈");
        p2.setName("小楚");
        
        makeWork(p1);
        makeSay(p1);
        makeWork(p2);
        makeSay(p2);

        ((Student) p1).study();
        Teacher t = (Teacher) p2;
        t.teach();
    }
    public static void makeWork(Person p) {
        p.work();
    }
    public static void makeSay(Person p) {
        p.sayHello();
    }

}
