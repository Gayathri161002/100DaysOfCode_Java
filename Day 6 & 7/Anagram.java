import java.util.*;
public class Anagram
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        
        String s1=s.nextLine();
        String s2=s.nextLine();
        
        char[] A=s1.toCharArray();
        char[] B=s2.toCharArray();
        
        int len1=A.length;
        int len2=B.length;
        int count=0;
        if(len1==len2)
        {
            for(int i=0;i<len1;i++)
            {
                for(int j=0;j<len2;j++)
                {
                    if(A[i]==B[j])
                    {
                        B[j]='$';
                        count++;
                        break;
                    }
                }
            }
            
            if(count==len1)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
        
        else
        {
            System.out.println("false");
        }

    }
}