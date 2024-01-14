import java.util.*;

public class DPMinJump 
{
    static int minJump(int[] arr)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        
        int[] dp = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++)
        {
            dp[i] = Integer.MAX_VALUE;
        }
        
        dp[0] = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j <= i + arr[i] && j < arr.length; j++)
            {
                dp[j] = Math.min(dp[j], 1 + dp[i]);
            }
        }
        return dp[arr.length - 1];
    }

    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 1, 3, 2, 1, 2};
        System.out.println(minJump(arr));
    }
}
