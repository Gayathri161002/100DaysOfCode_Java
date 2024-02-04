import java.util.Arrays;
public class Greedy_CoinPiles
{
    static int coinPiles(int[] arr,int n,int k)
    {
        int minval = Integer.MAX_VALUE;
        
        for(int a : arr)
        {
            minval = Math.min(a,minval);
        }
        
        int result = 0;  
        
        for (int i = 0; i < n; i++)
        {
            int diff = arr[i] - minval;
            
            if(diff > k) 
            {
                result += (diff - k);
            }
        }
        
        return result;
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 5, 1, 2, 5, 1 };
        int n = arr.length-1;
        int k = 3;
        
        System.out.println(coinPiles(arr,n,k));
    }
}
