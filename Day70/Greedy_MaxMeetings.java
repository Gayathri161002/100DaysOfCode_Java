import java.util.Arrays;
import java.util.Comparator;

public class Greedy_MaxMeetings
{

    static int maxMeetings(int[][] meetings) 
    {
        int n = meetings.length;

        Arrays.sort(meetings, Comparator.comparingInt(m -> m[1]));

        int count = 1;  
        int i = 0;

        for (int j = 1; j < n; j++)
        {
            if (meetings[j][0] >= meetings[i][1]) 
            {
                count++;
                i = j;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] meetings = {{1, 2}, {3, 4}, {0, 6}, {5, 7}, {8, 9}};

        int count = maxMeetings(meetings);
        System.out.println(count);
    }
}
