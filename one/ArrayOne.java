package one;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayOne {
    public static void main(String[] args) {
        // 静态初始化
        String[] fruits = {"香蕉","苹果","橘子"};

        // 动态初始化 (指定长度)
        int[] scores = new int[3];
        scores[0] = 100;
        scores[1] = 90;
        scores[2] = 80;

        // 快速创建不可变的列表
        List<Integer> numbers = List.of(1,2,3); // 不可变、拒绝 null、代码简洁
        List<String> myName = List.of("郭丁远");
        List<Object> empty = List.of(); // 空列表

        System.out.println("查看使用 List.of() 创建的列表: \n"
                + Arrays.toString(numbers.toArray()) + " numbers,\n "
                + Arrays.toString(myName.toArray()) + " name,\n "
                + Arrays.toString(empty.toArray()) + " 空列表. \n"
        );

        // 遍历数组
        for (int sco : scores) {
            // 简单但是不能改数值
            System.out.println("分数: " + sco);
        }
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("水果: " + i + " " + fruits[i]);
        }

        // 二维数组
        int[][] matrix = { // 索引从零开始 
            {1,2,3},
            {4,5,6,7} // 不规则的二维数组, 每行长度可以不同
        };

        int[][] matrix2 = new int [4][5]; // 4行5列. 所有元素默认为 0

        // for 循环遍历数组
        System.out.println("二维数组 for 循环遍历");
        // matrix 本身是包含 2 个元素的数组，这两个元素分别是 {1,2,3} 和 {4,5,6,7}。所以 matrix.length = 2（有 2 行）
        for (int i = 0; i < matrix.length; i++) { // i < 2，遍历第0行和第1行
            for (int j = 0; j < matrix[i].length; j++) { // j < 当前行的长度
                System.out.println(matrix[i][j] + " ");
            }
        }

        System.out.println("matrix[1][2] = " + matrix[1][2]); // 6
        System.out.println("");
        // Arrays.toString() 就是专门用来把数组变成可读的字符串的工具
        System.out.println("使用 Arrays.toString() 输出数组");
        System.out.println(Arrays.toString(scores));
        System.out.println("多维数组用 Arrays.deepToString() " + Arrays.deepToString(matrix)); // 多维数组要用 deepToString
        System.out.println(Arrays.toString(fruits));

        // 复制数组 Arrays.copyOf() 和 System.arraycopy()
        // 1. 将指定源数组的一部分元素复制到目标数组的指定位置
        int[] scores2 = new int[3];
        System.arraycopy(scores, 0, scores2, 0, scores.length);
        // src：源数组; srcPos：从源数组的哪个索引开始复制; dest：目标数组; destPos：从目标数组的哪个索引开始复制; length：要复制的长度(元素个数)
        /*
        必须事先创建好目标数组，且目标数组容量要足够容纳复制的元素，否则会抛 ArrayIndexOutOfBoundsException。
        可以复制数组的任意一段，也可以把元素复制到目标数组的中间。
        支持同一个数组内的自我复制（比如要把一个数组内的元素往后移动）。
        是 native 方法，性能很高，适合对性能有极致要求的场景。
        不创建新数组，只把数据拷贝到已存在的数组中。
        */

        // 2. Arrays.copyOf() 专门用于复制数组并返回一个新数组
        // Arrays.copyOf(原数组, 新数组长度); 如果是对象数组，还有 Arrays.copyOf(原数组, 新数组长度, 新数组类型)
        int[] scores3 = Arrays.copyOf(scores, scores.length);
        // 也可以通过指定长度来截断或扩容
        int[] shorter = Arrays.copyOf(scores, 2);
        int[] longer = Arrays.copyOf(scores, 10); // 多余的默认为零
        /*
        自动创建目标数组，你不需要事先 new 一个数组
        新数组的长度由第二个参数决定：
            1. 如果小于源数组长度，则截断复制前N个元素；
            2. 如果大于源数组长度，则多出来的位置用默认值填充（数值类型为0，布尔为false，对象为null）
        内部其实是调用了 System.arraycopy()，所以性能同样很好，只是多了一层数组创建的封装

        */
        System.out.println("\nscores2 = " + Arrays.toString(scores2) + "\nscores3 = " + Arrays.toString(scores3)
        + "\nshorter = " + Arrays.toString(shorter) + "\nlonger = " + Arrays.toString(longer));

        // 数组与集合的转换
        // 数组 -> 列表 (大小固定)
        List<String> list = Arrays.asList(fruits); // 返回的 List 大小固定，不能 add/remove，但可以修改元素
        // 可变列表
        List<String> mutableList = new ArrayList<>(Arrays.asList(fruits));
        // 集合 -> 数组
        String[] arr = list.toArray(new String[3]); // 指定长度为3，自动创建合适大小的数组




    }
}
/*
List<String> list = List.of("张三", "李四");
System.out.println(list);  // 输出 [张三, 李四]
List 重写了 toString() 方法，而数组没有重写，所以只能靠 Arrays.toString() 帮忙

如果你想保留原数组不变，得到一份新的数组，用 Arrays.copyOf() 最方便。
如果你已经有一个目标数组，想把数据拷进去（例如合并多个数组到一个大数组），或者需要把源数组的某一段拷到目标数组的中间位置，用 System.arraycopy() 更直接。
如果要对同一个数组做内部移动（比如删除某个元素后整体前移），只能用 System.arraycopy()。
如果只是简单复制整份数组，Arrays.copyOf() 一行搞定，可读性更好。
*/
// method(new String[]{"x", "y"});
// 现场捏一个数组扔给方法用，不另外起名

/*
拓展: 
Arrays.toString(arr) / Arrays.deepToString(arr)：打印内容。
Arrays.sort(arr)：升序排序。
Arrays.binarySearch(arr, key)：二分查找（必须已排序）。
Arrays.fill(arr, val)：用指定值填充所有元素。
Arrays.copyOf(original, newLength)：复制并可能截断或填充。
Arrays.equals(a, b) / Arrays.deepEquals(a, b)：比较内容。
*/