public class RecursionSearch
{
    public static int search(int[] A,int key,int index)
    {
        if(A.length == index)
        {
            return -1;
        }
        if(A[index]==key)
        {
            return index;
        }
        index++;
        return search(A,key,index); 
    }
    
    public static void main(String args[]) 
    {
      int[] A = {1,2,3,4,5,6};
      int key = 4;
      int index = 0;
      System.out.println(search(A,key,index));
    }
}