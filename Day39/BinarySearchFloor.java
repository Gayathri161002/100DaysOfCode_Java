// The floor of a number is the largest integer that is less than or equal to that number.

public class BinarySearchFloor
{
    static void PrintArray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    
    static int floor(int[] A,int key)
    {
        int low = 0;
        int high = A.length - 1;
        
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            
            if(A[mid] == key)
            {
                return A[mid];
            }
            
            if(A[mid] < key)
            {
                low = mid + 1;
            }
            
            else
            {
                high = mid - 1;
            }
        }
        return A[high];
    }

    public static void main(String args[]) 
    {
      int[] A = {3,14,15,22,44,53};
      PrintArray(A);
      int key = 25;
      System.out.println(floor(A,key));
    }
}

/*
Output :
3 14 15 22 44 53 
index : 22

*/