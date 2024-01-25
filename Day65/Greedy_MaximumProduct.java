import java.util.*;
public class Greedy_MaximumProduct
{
    static int maximumProduct(int[] nums) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        int result1 = nums[0] * nums[1] * nums[n-1];
        int result2 = nums[n-1] * nums[n-2] * nums[n-3];
        return Math.max(result1, result2);
    }
    
    public static void main(String args[])
    {
        int[] nums = {-100, -200 , 0 , 2, 4};
        
        System.out.println(maximumProduct(nums));
    }
}