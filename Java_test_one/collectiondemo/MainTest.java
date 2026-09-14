package collectiondemo;

public class MainTest {
    public static void main(String[] args) {
        //创建管理对象
        StudentManager manager = new StudentManager();

        // 添加四个学生
        manager.addStduent(new Student("小尤",20));
        manager.addStduent(new Student("小许",21));
        manager.addStduent(new Student("小何",22));
        manager.addStduent(new Student("小吕",23));

        // 2. 打印所有学生
        manager.printAllStudents();

        // 3.删除小许
        System.out.println("\n-----删除小许-----");
        manager.deleteStudentByName("小许");

        // 4. 常识删除一个不存在的人
        System.out.println("\n-----尝试删除秦始皇-----");
        manager.deleteStudentByName("秦始皇");

        // 4. 再次打印
        System.out.println("\n-----删除后再次打印所有学生-----");
        manager.printAllStudents();
    }
}
