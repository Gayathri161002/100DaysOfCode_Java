public class DP_SubsetProblemWithEqualPartition
{
    static boolean isEqualPartitionAvailable(int[] set)
    {
        if(set.length == 0)
        {
           return false;
        }
    
        int sumOfArray = 0;
        for(int i=0;i<set.length;i++)
        {
            sumOfArray += set[i];
        }
        
        if(sumOfArray % 2 != 0)
        {
            return false;
        }
            
        int sum = sumOfArray/2;
        
        boolean[][] A = new boolean[set.length][sum+1];
    
        for(int j=0;j<set.length;j++)
        {
            A[j][0] = true;
        }
    
        for(int i=1;i<set.length;i++)
        {
            for(int j=1;j<=sum;j++)
            {  
                boolean result = A[i-1][j] || (j >= set[i] && A[i-1][j-set[i]]);
                
                A[i][j] = result;
            }
        }
    
        return A[set.length-1][sum];
    }    
    
    public static void main(String[] args) 
    {
        int[] set = {1, 2, 3, 5, 7};
        
        System.out.println(isEqualPartitionAvailable(set));
    }
}