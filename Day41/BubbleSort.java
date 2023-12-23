/*
Bubble Sort :
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order.

Time Complexity: O(N^2)
Auxiliary Space: O(1)

Output :
3 12 45 32 11 34 
3 11 12 32 34 45 

*/

public class BubbleSort
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
            for(int j=1;j<A.length;j++)
            {
                if(A[j] < A[j-1])
                {
                    int temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
            }
        }
        printArray(A);
    }
    public static void main(String args[]) 
    {
      int[] A = {3,12,45,32,11,34};
      printArray(A);
      sort(A);
    }
}
