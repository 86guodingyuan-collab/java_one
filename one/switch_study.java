package one;

public class switch_study {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "星期一";
                break;
            case 2:
                dayName = "星期二";
                break;
            case 3:
                dayName = "星期三";
                break;
            default:
                dayName = "可能是周四到周日";
                break;
        }
        System.out.println("今天是: " + dayName);
        int dayOfWeek2 = 4;
        // Java 14+ 的箭头语法 (更简洁, 推荐)
        String day = switch (dayOfWeek2) {
            case 1, 2 -> "工作日";
            case 3 -> "星期三";
            case 4, 5 -> "练车的日期"; 
            case 6, 7 -> {
                System.out.println("周末了, 可以休息一下");
                yield "周末"; // 多值 case 和 yield 关键字
            }
            default -> "这不属于周一到周末";
        };
        System.out.println("今天是: " + day);
/* yield 关键字
专门用于 switch 表达式的代码块中返回值。
它类似于方法里的 return，但只退出当前 switch 表达式，并返回指定值。
不能用在传统的 switch 语句（冒号格式、无返回值）里。
*/
        enum Color { RED, GREEN, BLUE } // 枚举类型 enum
        Color myColor = Color.RED;
        String desc = switch (myColor) {
            case RED -> "红色";
            case GREEN -> "绿色";
            case BLUE -> "蓝色";
            case null -> "未知颜色";
            // 可以不需要 default，因为枚举类型是穷尽的（exhaustive）
        };
        System.out.println("颜色: " + desc);
        System.out.println("\n枚举类型所有值: ");

        for (Color col : Color.values()) {
            System.out.println(col);
        }
        System.out.println("");
        /*
        模式匹配 switch
        如果 switch 的对象类型较宽（比如 Object），
        可以结合模式匹配，自动类型转换并解构
        */
       // Object 类型的变量可以接收任何对象，这就是多态
       // 但想使用对象的具体功能时，往往需要知道它真正的类型并强制转换回去（或者用 instanceof 检查）
       Object obj = -123;
       String result = switch (obj) {
        case Integer i -> {
            if (i > 0) yield "正整数: " + i; // 箭头语法里可以直接使用 yield
            else yield "非正整数: " + i;
        } // 可以在 case 里声明变量，直接在右边使用，如 Integer i
        case String s -> "字符串: " + s;
        case null -> "空值";
        default -> "其他类型";
       };
       System.out.println(result);

    }
}
/*
switch 语句适用场景: 根据某个变量的不同值，得到一个结果
1.将单变量映射为某个值: 将单变量映射为某个值
2.处理枚举、状态机状态转换: 和密封类、模式匹配结合更强大
3.代替较长的 if-else if 链: 可读性更强，意图更明确
*/
