import java.util.*;
public class StringXPattern
{
    public static void patternPrint(char[] A)
    {
        int len=A.length;
        int x=0;
        int y=len-1;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(j==x)
                {
                    System.out.print(A[x]);
                }
                else if(j==y)
                {
                    System.out.print(A[y]);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            x++;
            y--;
        }
    }
    public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      char[] A=str.toCharArray();
      patternPrint(A);
    }
}
