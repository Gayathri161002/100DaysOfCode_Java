// Same as Ceil Function

public class BinarySearchCeilChar
{
    static void PrintArray(char[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    
    static char ceilChar(char[] A,char key)
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
        return A[low];
    }

    public static void main(String args[]) 
    {
      char[] A = {'g','h','l','r'};
      PrintArray(A);
      char key = 'f';
      System.out.println(ceilChar(A,key));
    }
}

/*
Output :
g h l r 
g

*/