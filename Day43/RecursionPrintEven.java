public class RecursionPrintEven
{
    public static void printEven(int start,int end)
    {
        if(start > end)
        {
            return;
        }
        
        if(start%2 == 0)
        {
            System.out.print(start + " ");
        }
        start++;
        printEven(start,end);
    }
    public static void main(String args[]) 
    {
      int start = 0;
      int end = 100;
      printEven(start,end);
      
    }
}