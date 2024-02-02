// Java program to find maximum sum by selecting a element from n arrays

import java.util.*;
public class Greedy_MaxSum 
{
                  static int maximumSum(int[][] a, int n, int m)
	{
	    
		int prev = Math.max(a[n - 1][0], a[n - 1][m - 1] + 1);

		int sum = prev;
		
		for (int i = n - 2; i >= 0; i--) 
		{
			int max_smaller = Integer.MIN_VALUE;
			
			for (int j = m - 1; j >= 0; j--)
			{	
			    if (a[i][j] < prev && a[i][j] > max_smaller)
			    {
					max_smaller = a[i][j];
			    }	
			}
			
			if (max_smaller == Integer.MIN_VALUE)
			{
				return 0;
			}
			
			prev = max_smaller;
			sum += max_smaller;
		}
		
		return sum;
	}

	public static void main(String[] args)
	{
		int arr[][] = { { 1, 7, 3, 4 },
						{ 4, 2, 5, 1 },
						{ 9, 5, 1, 8 } };
						
		int n = arr.length;
		int m =arr[0].length;
		
		System.out.print(maximumSum(arr, n, m));
	}
}
