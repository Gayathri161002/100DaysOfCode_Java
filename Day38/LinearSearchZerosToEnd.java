public class LinearSearchZerosToEnd
{
    static void PrintArray(int[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
    
    static void zerosToEnd(int[] A)
    {
        int ind = 0;
        int len = A.length;
        for(int i=0;i<len;i++)
        {
            if(A[i] != 0)
            {
                A[ind] = A[i];
                ind++;
            }
        }
        
        while(ind < len)
        {
            A[ind] = 0;
            ind++;
        }
    }
    public static void main(String args[]) 
    {
      int[] A = {2,0,10,0,6,4,0};
      PrintArray(A);
      zerosToEnd(A);
      PrintArray(A);
    }
}

/*
Output :
2 0 10 0 6 4 0 
2 10 6 4 0 0 0 

*/