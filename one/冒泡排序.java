package one;
import java.util.Arrays;
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] score = {100, 92, 85, 60, 77, 55};
        // 排序: 从小到大(冒泡排序)
        for (int i = 0; i < score.length-1; i++) {
            for (int j = 0; j < score.length - 1 - i; j++)
            {
                if (score[j] > score[j + 1]) {
                    int temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(score));
    }
}
