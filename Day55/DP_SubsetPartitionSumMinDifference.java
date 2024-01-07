import java.util.*;
public class DP_SubsetPartitionSumMinDifference
{
    static int subsetPartitionMinDifference(int[] set)
    {
        if(set.length == 0)
        {
           return 0;
        }
    
        int sumOfArray = 0;
        for(int i=0;i<set.length;i++)
        {
            sumOfArray += set[i];
        }
        
        int sum = sumOfArray/2;
        
        boolean[][] A = new boolean[set.length][sum+1];
    
        for(int i=0;i<set.length;i++)
        {
            A[i][0] = true;
        }
        
        for(int i=0;i<=sum;i++)
        {
            if(i == set[0])
            {
                A[0][i] = true;
            }
        }
    
        for(int i=1;i<set.length;i++)
        {
            for(int j=1;j<=sum;j++)
            {  
                boolean result = A[i-1][j] || (j >= set[i] && A[i-1][j-set[i]]);
                
                A[i][j] = result;
            }
        }
    
        int lastRow = A.length-1;
        int firstPartitionSum = -1;
        
        for(int j=sum;j>=0;j--)
        {
            if(A[lastRow][j])
            {
                firstPartitionSum = j;
                break;
            }
        }
        
        int secondPartitionSum = sumOfArray - firstPartitionSum;
        
        return Math.abs(firstPartitionSum - secondPartitionSum);
    }    
    
    public static void main(String[] args) 
    {
        int[] set = {1, 2, 3, 5, 12};
        
        System.out.println(subsetPartitionMinDifference(set));
    }
}