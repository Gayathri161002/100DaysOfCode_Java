class DPSumPartition
{
    public boolean canPartition(int[] nums)
    {
        if(nums.length == 0)
        {
            return false;
        }

        int sumArray = 0;

        for(int i : nums)
        {
            sumArray += i;
        }

        if(sumArray % 2 != 0)
        {
            return false;
        }
        
        int sum = sumArray/2;

        boolean[][] dp = new boolean[nums.length][sum+1];

        for(int i=0;i<nums.length;i++)
        {
            dp[i][0] = true;
        }

        for(int i=1;i<nums.length;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                boolean result = dp[i-1][j] || (j >= nums[i] && dp[i-1][j-nums[i]]);
                dp[i][j] = result;
            }
        }

        return dp[nums.length-1][sum];
    }
    
    public static void main(String[] args) 
    {
        int[] nums = {1, 2, 3, 5, 7};
        
        System.out.printlncanPartition(nums));
    }
    
}