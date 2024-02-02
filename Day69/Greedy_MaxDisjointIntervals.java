import java.util.*;
public class Greedy_MaxDisjointIntervals 
{
    static int maxDisjointIntervals(int[][] arr)
    {
        int count = 1;
        
        Arrays.sort(arr , Comparator.comparingInt(Arr -> Arr[1]));
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i][0] >= arr[i-1][1])
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]) 
    {
        int[][] arr = { {1, 4}, {2, 3}, {4, 6}, {8, 9} };
        
        System.out.println(maxDisjointIntervals(arr));
    }
}