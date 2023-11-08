import java.util.*;
public class CountLetters {
    public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      char[] A=str.toCharArray();
      char[] B=new char[123];

      for(int i=0;i<B.length;i++)
      {
          B[i]=0;
      }
      
      for(int i=0;i<A.length;i++)
      {
          int k=(int)A[i];
          B[k]++;
      }
      
      int count=0;
      for(int i=97;i<B.length;i++)
      {
          if(B[i]!=0)
          {
              count++;
          }
      }
      
      System.out.println(count);
    }
}