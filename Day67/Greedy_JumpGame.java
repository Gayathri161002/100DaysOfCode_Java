public class Greedy_JumpGame
{
    static int minJump(int[] nums) 
    {
        int n = nums.length;
        if(n == 1)
        {
            return 0;
        }

        int jumps = 0;
        int currentMaxValue = 0;
        int nextMaxValue = 0;

        for(int i=0;i<n-1;i++)
        {
            nextMaxValue = Math.max(nextMaxValue, i + nums[i]);

            if(i == currentMaxValue)
            {
                jumps++;
                currentMaxValue = nextMaxValue;
            }
        }
        return jumps;
    }
    
    public static void main(String[] args)
    {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(minJump(nums));
    }
}