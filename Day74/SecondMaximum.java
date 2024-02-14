import java.util.*;
public class SecondMaximum
{
    static int secondMaximum(int[] arr,int n)
    {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i] > firstMax)
            {
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] <firstMax )
            {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    
	public static void main(String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter size of the array : ");
	    int size = s.nextInt();
	    System.out.println("Enter array elements : ");
	    int[] arr = new int[size];
	    for(int i=0;i<size;i++)
	    {
	        arr[i] = s.nextInt();
	    }
	    
	    System.out.println("Second Maximum : " + secondMaximum(arr,size));
	}
}
