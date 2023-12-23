public class CyclicSortMissingNumber
{
    public static void printArray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    public static void missingNum(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            int crtPos = A[i] - 1;
            if(A[i] != A[crtPos])
            {
                int temp = A[i];
                A[i] = A[crtPos];
                A[crtPos] = temp;
            }
        }
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i] != i+1)
            {
                System.out.println(i+1);
                break;
            }
        }
    }
    public static void main(String args[]) 
    {
      int[] A = {3,3,5,4,1};
      printArray(A);
      missingNum(A);
    }
}

/*
Output :
3 3 5 4 1 
2

*/