public class LinearSearchRotateArray
{
    static void PrintArray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    
    static void rotateArray(int[] A,int r)
    {
        int len = A.length;
        r = r % len;
        while(r > 0)
        {
            int last = A[len-1];
            for(int i=len-1;i>0;i--)
            {
                A[i] = A[i-1];
            }
            A[0] = last;
            r--;
        }
    }
    
    public static void main(String args[]) 
    {
      int[] A = {1,2,3,4,5};
    
      PrintArray(A);
      rotateArray(A,2);
      PrintArray(A);
    }
}

/*
Output :
1 2 3 4 5 
4 5 1 2 3 

*/