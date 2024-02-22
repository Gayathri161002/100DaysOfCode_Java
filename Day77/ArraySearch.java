import java.util.*;
public class ArraySearch
{
    static boolean search(int[] arr,int n,int k)
    {
        boolean isAvail = false;
        
        for(int i : arr)
        {
            if(i == k)
            {
                isAvail = true;
                break;
            }
        }
        
        return isAvail;
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
	    System.out.println("enter the element to be search : ");
	    int k = s.nextInt();
	    
		if(search(arr,n,k))
		{
		    System.out.println("the key element is present in the array");
		}
		else
		{
		    System.out.println("the key element is not present in the array");
		}
	}
}
