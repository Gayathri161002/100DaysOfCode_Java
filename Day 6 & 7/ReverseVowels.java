import java.util.*;
public class ReverseVowels
{
    public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      char[] A=str.toCharArray();
      
      int i=0;
      int j=A.length-1;
      while(i<j)
      {
          while(!(A[i]=='a' || A[i]=='e' || A[i]=='i' || A[i]=='o' || A[i]=='u'))
          {
              i++;
          }
          while(!(A[j]=='a' || A[j]=='e' || A[j]=='i' || A[j]=='o' || A[j]=='u'))
          {
              j--;
          }
          
          if(i<j)
          {
              char temp=A[i];
              A[i]=A[j];
              A[j]=temp;
              i++;
              j--;
          }
      }
      System.out.print(A);
    }
}