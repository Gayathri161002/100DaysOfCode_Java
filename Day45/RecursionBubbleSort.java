public class RecursionBubbleSort
{
    static void bubbleSort(int[] A,int end,int start)
    {
        if(end == 0)
        {
            return;
        }
        if(start < end)
        {
            if(A[start] > A[start+1])
            {
                int temp = A[start];
                A[start] = A[start+1];
                A[start+1] = temp;
            }
            bubbleSort(A,end,start+1);
        }
        else
        {
            bubbleSort(A,end-1,0);
        }
    }
    public static void main(String args[]) 
    {
        int[] A = {5,4,3,2,1};
        bubbleSort(A,A.length-1,0);
        for(int i : A)
        {
            System.out.print(i + " ");
        }
    }
}
