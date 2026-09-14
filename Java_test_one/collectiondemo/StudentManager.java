package collectiondemo;
import java.util.*;
public class StudentManager { // 学生管理类, 专门负责对学生集合进行操作
    // 用 private 隐藏集合数据, 外部只能通过方法操作(封装)
    private List<Student> studentList = new ArrayList<>();
    // 1. 添加学生
    public void addStduent(Student stu) {
        studentList.add(stu);
        System.out.println("成功添加学生: " + stu.getName());
    }

    // 2. 打印所有学生信息
    public void printAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("当前没有学生数据!");
            return;
        }
        else {
            System.out.println("-----学生列表开始-----");
            for (Student stu : studentList) {
                System.out.println(stu); // 调用 Student 类的 toString() 方法
            }
        }
        System.out.println("-----学生列表结束, 共" + studentList.size() + "名学生-----");
    }
    // 3. 根据学生姓名删除对应的学生
    public void deleteStudentByName(String name) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equals(name)) {
                studentList.remove(i); // 按索引删除
                System.out.println("成功删除学生: " + name);
                return; // 删除后立刻结束方法, 避免继续遍历导致并发修改异常
            }
        }
        // 如果循环走完没找到
        System.out.println("未找到姓名为 \"" + name + "\" 的学生, 删除失败!");
    }
 }
