import java.util.*;
public class DP_TargetSum
{
    static int targetSum(int[] sets,int sum)
    {
        if(sets.length == 0 || sum <= 0)
        {
           return 0;
        }
       
        int sumOfArray = 0;
       
        for(int i=0;i<sets.length;i++)
        {
           sumOfArray += sets[i];
        }
       
        if(sumOfArray < sum || (sumOfArray + sum) % 2 != 0)
        {
           return 0;
        }
        
        int sumToCheck = (sumOfArray + sum) / 2;
        
        return countOfSubsets(sets,sumToCheck);
       
    }
    
    static int countOfSubsets(int[] sets,int sum)
    {
       
       
       int[][] count = new int[sets.length][sum+1];
       
       for(int i=0;i<sets.length;i++)
       {
           count[i][0] = 1;
       }
       
       for(int i=0;i<=sum;i++)
       {
           if(sets[0] == i)
           {
               count[0][i] = 1;
           }
       }
    
        for(int i=1;i<sets.length;i++)
        {
            for(int j=1;j<=sum;j++)
            {  
                int includingValue = 0;
                int excludingValue = 0;
            
                if(sets[i] <= j)
                {
                    includingValue = count[i-1][j-sets[i]];
                }
                if(i > 0)
                {
                    excludingValue = count[i-1][j];
                }
            
                count[i][j] = includingValue + excludingValue;
            }
        }
    
        return count[sets.length-1][sum];
    }    
    
    public static void main(String[] args) 
    {
        int[] sets = {1, 2, 3, 1};
        int sum = 5;
        System.out.println(targetSum(sets,sum));
    }
}