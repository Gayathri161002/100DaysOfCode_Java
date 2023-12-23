import java.util.*;
public class CyclicSortMismatchSet
{
    public static void printArray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    public static List<Integer> mismatchSet(int[] A)
    {
        List<Integer> mismatchList = new ArrayList<>();
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
                mismatchList.add(i+1);
                mismatchList.add(A[i]);
            }
        }
        
        return mismatchList;
    }
    public static void main(String args[]) 
    {
      int[] A = {3,2,5,4,1,4,2,7};
      printArray(A);
      System.out.println("Mismatch Set : " + mismatchSet(A));
    }
}

/*
Output :
3 2 5 4 1 4 2 7 
Mismatch Set : [6, 4, 8, 2]

*/