import java.util.*;
public class ReverseSentence {
    public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      char[] A=str.toCharArray();
      
      int count=0;
      for(int i=A.length-1;i>=0;i--)
      {
          if(A[i]!=' ')
          {
              count++;
          }
          
          else
          {
              for(int j=i+1;j<=i+count;j++)
              {
                  System.out.print(A[j]);
              }
              System.out.print(" ");
              count=0;
          }
      }
      
      for(int i=0;A[i]!=' ';i++)
      {
          System.out.print(A[i]);
      }
    }
}