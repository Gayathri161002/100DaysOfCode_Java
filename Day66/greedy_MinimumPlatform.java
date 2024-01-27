import java.util.*;
public class greedy_MinimumPlatform 
{
    static int minimumPlatform(int[] arr, int[] dep, int n)
    { 
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int  i = 1 , j = 0;
        int count = 1;
        int max = 1;
        
        while(i < n && j < n)
        {
            if(arr[i] <= dep[j])
            {
                count++;
                i++;
            }
            
            else if(arr[i] > dep[j])
            {
                count--;
                j++;
            }
            
            if(count > max)
            {
                max = count;
            }
        }
        
        return max;
    }
    public static void main(String args[]) 
    {
        int n = 6;
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println(minimumPlatform(arr, dep, n));
    }
}