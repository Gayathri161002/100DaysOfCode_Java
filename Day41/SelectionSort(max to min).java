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
            int maxIndex = i;
            
            for(int j=i+1;j<len;j++)
            {
                if(A[j] > A[maxIndex])
                {
                    maxIndex = j;
                }
            }
            int temp = A[i];
            A[i] = A[maxIndex];
            A[maxIndex] = temp;
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

/*
Output :
3 12 45 32 11 34 
45 34 32 12 11 3 

*/
