import java.util.*;
public class DailyTemperature
{
    public static int[] dailyTemperatures(int n,int[] temp_ary)
    {
        Stack<Integer> stk = new Stack<>();
        int[] result= new int[n]; 
        
        for(int i=0;i<n;i++)
        {
            while((!stk.isEmpty()) && (temp_ary[i] > temp_ary[stk.peek()]))
            {
                int index=stk.pop();
                result[index]=i-index;
            }
            
            stk.push(i);   
        }
        
        return result;
    }
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] temp_ary = new int[n];
		for(int i=0;i<n;i++)
		{
		    temp_ary[i]=s.nextInt();
		}
		
		int[] result=dailyTemperatures(n,temp_ary);
		
		for(int i=0;i<n;i++)
		{
		    System.out.print(result[i] + " ");
		}
	}
}

/*
https://leetcode.com/problems/daily-temperatures/description/

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]

Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]
*/