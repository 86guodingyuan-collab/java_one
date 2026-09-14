package one;
import java.util.List;
public class for_and_while {
    public static void main(String[] args) {
        // for 循环
        System.out.println("for 循环演示: 从1到5");

        for (int i = 1; i <= 5; i++) { // 三个表达式都可以为空：for(;;) 是一个无限循环，等效于 while(true)
            // 可以在初始化部分声明多个变量，用逗号隔开
            // for (int i = 0, j = 10; i < j; i++, j--) { ... }
            System.out.println("现在是: " + i);
        }

        // while 循环
        System.out.println("\nwhile 循环演示: 从 1 加到 100 ");
        int sum = 0;
        int count = 1;
        while (count <= 100) { // 先检查条件，条件为 true 才进入循环
            sum += count;
            count++; // 必须自己在循环体内改变条件涉及到的变量，否则会死循环
        }
        System.out.println("从 1 加到 100 的结果是: " + sum);

        // do-while 循环 (先做一次, 再判断是否继续做)
        System.out.println("\ndo-while 循环演示: 从 1 加到 100 ");
        sum = 0;
        count = 1;
        do {
            sum += count;
            count++;
        } while (count <= 100); // 先执行循环体，再检查条件
        System.out.println("从 1 加到 100 的结果是: " + sum);


        // 增强 for 循环(for-each遍历数组)
        System.out.println("\n增强 for 循环演示: 遍历数组");
        int[] numbers = {10,20,30,40,50,};
        for (int n : numbers) {
            System.out.println(n);
        }
        System.out.print("\n");
        List<String> names = List.of("张三", "李四", "王五");
        // List<String>：声明变量 names 的类型是一个“字符串列表”，尖括号里的 String 表示列表里只能放字符串。
        // List.of(...)：这是 List 接口的一个静态工厂方法（Java 9 起引入），用来快速创建一个不可变的列表。
        // "张三", "李四", "王五"：三个字符串参数，最终会成为列表的三个元素，顺序就是传入的顺序
        // 运行后，names 就相当于一个包含 [张三, 李四, 王五] 的列表
        // 通过 List.of 创建的列表是不可变的
        for (String name :names) {
            System.out.println(name);
        }
    }
}
// break : 跳出循环
// continue : 跳过本次循环, 继续下一次循环


/*
1. for 循环: 
明确知道循环次数、有索引变量时最自然。
需要控制步长（如每次 + 2）。
需要同时操作数组索引和值的场合。
2. while 循环:
循环次数未知，由动态条件决定时（如用户输入、数据读取直至结束）。
迭代器那种 while(iterator.hasNext()) 的模式（不过现在常用 for-each 代替）。
复杂的循环条件，难以用 for 清晰表达的时候
3. 增强型 for 循环（for-each）
语法结构: 
for (元素类型 临时变量 : 数组或Iterable集合) {
    使用临时变量
}
会依次将 numbers 中的每个元素赋给 n，然后执行循环体。
不需要索引，不需要获取长度，也不需要担心越界。
注意: 
1. 只能读取，不能修改原数组/集合的元素值（如果元素是基本类型或不可变对象）。
n 只是一个副本，n = 5 不会影响数组内容。要想修改，必须用传统 for 循环通过索引赋值。
2. 遍历的是拷贝引用（对象类型时）：如果元素是对象，n 是同一个对象的引用，
你可以通过 n.方法() 修改对象内部状态，但不能把 n 重新指向别的对象。
3. 遍历过程中不能删除/添加元素（对集合）。若在迭代时修改集合结构（如 list.remove()），
会抛出 ConcurrentModificationException。需要使用迭代器的 remove() 或使用 removeIf、流操作等。
4. 底层数组为空或集合为空时，循环体直接跳过，不会抛出空指针异常（前提是数组/集合本身不为 null，否则 NPE）。
5. 只能从前往后遍历，不能反向、不能跳跃

适用场景: 
单纯需要读取所有元素，不关心索引。
推荐在不需要索引的大部分情况都使用它
*/
