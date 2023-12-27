public class RecursionFibonnaci
{
    static int fibonnaci(int sum)
    {
        if(sum == 0 || sum == 1)
        {
            return sum;
        }
        return fibonnaci(sum-1) + fibonnaci(sum-2);
    }
    public static void main(String args[]) 
    {
        int sum = 6;
        System.out.println(fibonnaci(sum));
    }
}