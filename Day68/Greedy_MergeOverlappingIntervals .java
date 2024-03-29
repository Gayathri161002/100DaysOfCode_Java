import java.util.*;

public class Greedy_MergeOverlappingIntervals 
{
    public static int[][] mergeIntervals(int[][] intervals) 
    {
        if (intervals == null || intervals.length <= 1) 
        {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) 
        {
            int[] nextInterval = intervals[i];

            if (currentInterval[1] >= nextInterval[0]) 
            {
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } 
            else 
            {
                result.add(currentInterval);
                currentInterval = nextInterval;
            }
        }

        result.add(currentInterval);

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) 
    {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int[][] mergedIntervals = mergeIntervals(intervals);

        System.out.println(Arrays.deepToString(mergedIntervals));
    }
}
