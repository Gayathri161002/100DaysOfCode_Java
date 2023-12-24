public class RecursionPrintOdd
{
    public static void printOdd(int start,int end)
    {
        if(start > end)
        {
            return;
        }
        
        if(start%2 != 0)
        {
            System.out.print(start + " ");
        }
        start++;
        printOdd(start,end);
    }
    public static void main(String args[]) 
    {
      int start = 0;
      int end = 100;
      printOdd(start,end);
      
    }
}