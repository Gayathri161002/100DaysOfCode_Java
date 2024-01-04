import java.util.*;
public class DynamicProgrammingFibonacci
{
    public static Map<Integer,Integer> dp = new HashMap<>();
    
    static int fibo(int n)
    {
        if(dp.containsKey(n))
        {
            return dp.get(n);
        }
        
        if(n == 1 || n == 0)
        {
            return n;
        }
        
        int result = fibo(n-1) + fibo(n-2);
        dp.put(n,result);
        
        return result;
    }
    public static void main(String args[]) 
    {
        int n = 5;
        System.out.println(fibo(n));
    }
}