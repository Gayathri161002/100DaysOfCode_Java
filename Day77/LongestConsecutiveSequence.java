import java.util.*;

public class LongestConsecutiveSequence 
{

    static void longestSequence(int[] arr) 
    {
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
        int i = 0;
        while (i < arr.length) 
        {
            ArrayList<Integer> inList = new ArrayList<>();
            inList.add(arr[i]);
            int j = i + 1;
            while (j < arr.length && arr[j] == arr[j - 1] + 1) 
            {
                inList.add(arr[j]);
                j++;
            }
            arrList.add(inList);
            i = j;
        }


        ArrayList<Integer> longestSequence = new ArrayList<>();
        for (ArrayList<Integer> list : arrList) 
        {
            if (list.size() > longestSequence.size()) 
            {
                longestSequence = list;
            }
        }

        System.out.println("Longest consecutive sequence: " + longestSequence);
    }

    public static void main(String[] args) 
    {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 67, 65};

        longestSequence(arr);
    }
}
