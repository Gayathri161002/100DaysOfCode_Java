/*
Cyclic Sort :
It can be used when the given problem in the range of 1 to N.

Time Complexity for worst case : O(N)

Output :
3 2 5 4 1 
1 2 3 4 5

*/

public class CyclicSort
{
    public static void printArray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    public static void sort(int[] A)
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
        printArray(A);
    }
    public static void main(String args[]) 
    {
      int[] A = {3,2,5,4,1};
      printArray(A);
      sort(A);
    }
}
