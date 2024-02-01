import java.util.*;
public class Greedy_MinimumHeight
{
    static int minimumHeight(int k,int n,int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        int min1 = 0, max1 = 0;
        
        for(int i=0;i<n;i++)
        {
            if(min == arr[i])
            {
                min1 = arr[i]+k;
            }
            else if(max == arr[i])
            {
                max1 = arr[i]-k;
            }
            else if(arr[i]+k > max)
            {
                arr[i] = arr[i]-k;
            }
            else if(arr[i]-k > min)
            {
                arr[i] = arr[i]+k;
            }
        }
        return max1-min1;
    }
    
    public static void main(String[] args) 
    {
        int k = 3;
        int n = 5;
        int[] arr = {3, 9, 12, 16, 20};
        
        System.out.println(minimumHeight(k,n,arr));
    }
}
