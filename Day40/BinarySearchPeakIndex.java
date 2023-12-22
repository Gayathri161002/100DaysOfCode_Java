// It returns the index where the element start decreasing

public class BinarySearchPeakIndex
{
    static void PrintArray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    
    static int peakIndex(int[] A)
    {
        int low = 0;
        int high = A.length - 1;
        
        while(low < high)
        {
            int mid = low + (high - low) / 2;
            
            if(A[mid] > A[mid+1])
            {
                high = mid;
            }
            else
            {
                low = mid + 1;
            }
        }
        return high;
    }

    public static void main(String args[]) 
    {
      int[] A = {1,2,3,4,5,4,3,2,1};
      PrintArray(A);
      int key = 22;
      System.out.println("Peak Index : " + peakIndex(A));
    }
}

/*
Output :
1 2 3 4 5 4 3 2 1 
Peak : 4

*/