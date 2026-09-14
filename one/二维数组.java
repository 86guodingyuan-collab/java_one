package one;
public class 二维数组 {
    public static void main(String[] args) {
        // 一共有上中下三层货柜, 每层货柜有六个抽屉
        // 抽屉内鸡蛋的个数是当前层数 * 货柜的层数
        int sum = 0; // 鸡蛋总数
        int[][] egg = new int[3][6];
        for (int i = 0; i < egg.length; i++) {
            System.out.println("----------第" + (i + 1) + "层货柜----------"); 
            for (int j = 0; j < egg[i].length; j++) {
  
                int count = (i + 1) * (j + 1);
                System.out.println("第" + (j + 1) + "个抽屉, 鸡蛋个数: " + count);
                sum += count;
            }
        }
        System.out.println("鸡蛋总数: " + sum);
    }
}
