public class BinarySearch 
{
    static void PrintArray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    
    static int search(int[] A,int key)
    {
        int low = 0;
        int high = A.length - 1;
        
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            
            if(A[mid] == key)
            {
                return mid;
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
        return -1;
    }

    public static void main(String args[]) 
    {
      int[] A = {3,14,15,22,44,53};
      PrintArray(A);
      int key = 22;
      System.out.println("index : " + search(A,key));
    }
}

/*
Output :
3 14 15 22 44 53 
index : 3

*/