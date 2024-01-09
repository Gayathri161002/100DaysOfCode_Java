import java.util.*;
public class DP_MinJumpsProblem
{
    static int minJumps(int[] arr)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        
        int[] MinJumps = new int[arr.length];
        
        for(int i=0;i<arr.length;i++)
        {
            MinJumps[i] = Integer.MAX_VALUE;
        }
        
        MinJumps[0] = 0;
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<=i+arr[i] && j<arr.length;j++)
            {
                MinJumps[j] = Math.min(1+MinJumps[i],MinJumps[j]);
            }
        }
        
        return MinJumps[arr.length-1];
    }
    
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 1, 3, 2, 1, 2, 1};
        
        System.out.println(minJumps(arr));
    }
}