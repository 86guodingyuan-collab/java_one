public class lesson_one_test 
{
    public static void main(String[] args)
    {
        int targetScore = 100;
        int sum = 0;
        for(int i = 1; i <=100; i++)
        {
           sum = sum + i + targetScore;
        }
        System.out.println("从1加到100(每次都加上targetScore)的总和是: " + sum);
    }
    
    
}