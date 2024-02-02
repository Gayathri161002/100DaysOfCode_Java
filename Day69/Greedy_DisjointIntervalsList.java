import java.util.*;
public class Greedy_DisjointIntervalsList
{
    static int[][] maxDisjointIntervals(int[][] arr)
    {
        int count = 1;
        List<int[]> result = new ArrayList<>();
        
        Arrays.sort(arr , Comparator.comparingInt(Arr -> Arr[1]));
        
        result.add(arr[0]);
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i][0] >= arr[i-1][1])
            {
                count++;
                result.add(arr[i]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String args[]) 
    {
        int[][] arr = { {1, 4}, {2, 3}, {4, 6}, {8, 9} };
        int[][] result = maxDisjointIntervals(arr);
        System.out.println(Arrays.deepToString(result));
    }
}