public class RecursionCountElements
{
    public static int countElements(int num,int count)
    {
        if(num == 0)
        {
            return count;
        }
        num = num/10;
        count++;
        return countElements(num,count); 
    }
    
    public static void main(String args[]) 
    {
      int num = 445673;
      int count = 0;
      System.out.println(countElements(num,count));
    }
}