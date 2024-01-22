import java.util.*;
public class DP_KadaneAlgorithm
{
    static int kadaneALg(int[] arr)
    {
        int maxEnd = arr[0];
        int maxSoFar = arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            maxEnd = maxEnd + arr[i];
            
            if(maxEnd < arr[i])
            {
                maxEnd = arr[i];
            }
            
            if(maxSoFar < maxEnd)
            {
                maxSoFar = maxEnd;
            }
        }
        
        return maxSoFar;
    }
    
    public static void main(String args[]) 
    {
        int[] arr = { -2, -3, 4, -1, -2, 1, 6, -3 };
        
        System.out.println(kadaneALg(arr));
    }
}