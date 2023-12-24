public class RecursionSort
{
    public static void sort(int[] A,int start)
    {
        if(A.length == start)
        {
            return;
        }
        for(int j=0;j<A.length-1-start;j++)
        {
            if(A[j]>A[j+1])
            {
                int temp = A[j];
                A[j] = A[j+1];
                A[j+1] = temp;
            }
        }
        start++;
        sort(A,start);
    }
    
    public static void main(String args[]) 
    {
      int[] A = {3,2,5,4,1};
      int start = 0;
      sort(A,start);
      for(int i=0;i<A.length;i++)
      {
          System.out.print(A[i] + " ");
      }
    }
}