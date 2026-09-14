package collection_demo;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        // 1. 创建一个 ArrayList 集合
        List<String> students = new ArrayList<>(); // 面向接口
        // 2.添加元素
        students.add("小韩"); // 0
        students.add("小杨"); // 1
        students.add("小朱"); // 2

        // 3. 插入元素
        students.add(1, "小秦"); // 在索引 1 的位置插入

        // 4. 获取元素
        System.out.println("第一个学生是: " + students.get(0));

        // 5. 删除元素
        students.remove(2); // 删除索引为 2 的元素

        // 6. 遍历合集
        System.out.println("所有学生: ");
        for(String student : students) {
            System.out.println(student);
        }

        // 7. 获取合集大小
        System.out.println("共有" + students.size() + "个学生");
    }
}
// 集合框架。集合是用来存储和管理一组数据的容器，类似于数组，但比数组更强大。
/*
List：有序、可重复的集合（比如：[1, 2, 2, 3]）
Set：无序、不可重复的集合（比如：[1, 2, 3]）
Map：键值对映射（比如：{"name": "张三", "age": 18}）
*/
