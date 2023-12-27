public class RecursionSum
{
    static int totalSum(int sum)
    {
        if(sum == 0)
        {
            return sum;
        }
        return sum + totalSum(sum-1);
    }
    public static void main(String args[]) 
    {
        int sum = 5;
        System.out.println(totalSum(sum));
    }
}