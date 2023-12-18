public class BinarySearchOccurance
{
    static void PrintArray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    
    static void occurance(int[] A,int key)
    {
        int[] result={-1,-1};
        int low = search(A,key,true);
        int high = search(A,key,false);
        result[0]=low;
        result[1]=high;
        System.out.println("The key " + key + " occured from " + result[0] + " to " + result[1]);
    }
    
    static int search(int[] A,int key, boolean find)
    {
        int low = 0;
        int high = A.length - 1;
        int index = -1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            
            if(A[mid] == key)
            {
                index = mid;
                
                if(find)
                {
                    high = mid - 1;
                }
                else
                {
                    low= mid + 1;
                }
            }
            
            else if(A[mid] < key)
            {
                low = mid + 1;
            }
            
            else
            {
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String args[]) 
    {
      int[] A = {2,3,4,4,4,5,6};
      PrintArray(A);
      int key = 4;
      occurance(A,key);
    }
}

/*
Output :
2 3 4 4 4 5 6 
The key 4 occured from 2 to 4

*/