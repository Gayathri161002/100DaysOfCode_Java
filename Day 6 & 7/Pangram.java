import java.util.*;
public class Pangram
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        
        String s1=s.nextLine();
        
        char[] A=s1.toCharArray();
        
        char ch=A[0];
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==ch)
            {
                count++;
            }
            else
            {
                System.out.print(ch + Integer.toString(count));
                ch=A[i];
                count=1;
            }
        }
        System.out.print(ch + Integer.toString(count));
    }
}