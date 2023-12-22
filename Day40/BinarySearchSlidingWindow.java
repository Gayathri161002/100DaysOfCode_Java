public class BinarySearchSlidingWindow
{
    static void PrintArray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    
    static int search(int[] A,int key,int start,int end)
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
      int[] A = {1,2,3,4,5,5,6,7,8,9,9,10,11,23,34,56,67,78,89};
      PrintArray(A);
      int key = 23;
      int start = 0;
      int end = 1;
      while(start <= end)
      {
          int result = search(A,key,start,end);
          {
              if(result != -1)
              {
                  System.out.println("index : " + result);
                  break;
              }
              else
              {
                  start = end;
                  end = end*2;
              }
          }
      }
    }
}

/*
Output :
1 2 3 4 5 5 6 7 8 9 9 10 11 23 34 56 67 78 89 
index : 13

*/