import java.util.*;
public class PositiveAndNegativeNumbers
{
    static void positiveAndNegative(int[] arr,int n)
    {
        ArrayList<Integer> alP = new ArrayList<>();
        ArrayList<Integer> alN = new ArrayList<>();
        
        int posSum = 0;
        int negSum = 0;
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        
        for(int i : arr)
        {
            if(i > 0)
            {
                alP.add(i);
                posCount++;
                posSum += i;
            }
            else if(i < 0)
            {
                alN.add(i);
                negCount++;
                negSum += i;
            }
            else 
            {
                zeroCount++;
            }
        }
        
        System.out.println("Positive elements  : " + alP);
        System.out.println("No of Positive elements  : " + posCount);
        System.out.println("Sum of Positive elements  : " + posSum);
        System.out.println();
        System.out.println("Negative elements  : " + alN);
        System.out.println("No of Negative elements  : " + negCount);
        System.out.println("Sum of Negative elements  : " + negSum);
        
        System.out.println("\nNo of zero elements  : " + zeroCount);
    }
    
	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter array size : ");
	    int n = s.nextInt();
	    s.nextLine();
	    System.out.println("enter array elements : ");
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i] = s.nextInt();
	    }
	    
	    positiveAndNegative(arr,n);
	}
}
