public class ControlFlow 
{
    public static void main(String[] args)
    {
        // 条件判断
        int score = 85;
        if (score >= 90)
        {
            System.out.println("优秀");
        }
        else if (score >= 60)
        {
            System.out.println("合格");
        }
        else
        {
            System.out.println("不合格");
        }

        // 循环 for 循环
        for (int i = 0; i <= 10; i++)
        {
            System.out.println("当前数字是: " + i);
        }

        // while 循环
        int count = 10;
        while (count > 0)
        {
            System.out.println("倒计时: " + count);
            count --;
        }
        System.out.println("倒计时结束!");

    }
}
