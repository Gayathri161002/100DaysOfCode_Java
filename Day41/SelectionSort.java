/*
Selection Sort :
Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest) element from the unsorted portion of the list and moving it to the sorted portion of the list. 

Time Complexity: O(N^2) 
Auxiliary Space: O(1)

Output :
3 12 45 32 11 34 
3 11 12 32 34 45 

*/

public class SelectionSort
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
        int len = A.length;
        for(int i=0;i<len-1;i++)
        {
            int minIndex = i;
            
            for(int j=i+1;j<len;j++)
            {
                if(A[j] < A[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = A[i];
            A[i] = A[minIndex];
            A[minIndex] = temp;
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
