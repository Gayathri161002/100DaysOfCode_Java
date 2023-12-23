/*
Insertion Sort :
In insertion sort , the array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.

Time Complexity: O(N^2) 
Auxiliary Space: O(1)

Output :
3 12 45 32 11 34 
3 11 12 32 34 45 

*/

public class InsertionSort
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
        for(int i=1;i<A.length;i++)
        {
            int key = A[i];
            int j = i - 1;
            
            while(j >= 0 && A[j] >key)
            {
                A[j+1] =A[j];
                j-=1;
            }
            A[j+1] = key;
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
