import java.util.*;
public class Capitalize
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        
        String s1=s.nextLine();
        
        char[] A=s1.toCharArray();
        
        A[0]=(char)(A[0]-32);
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==' ' && i<A.length-1 && A[i+1]>='a'  && A[i+1]<='z')
            {
                A[i+1]=(char)(A[i+1]-32);
            }
        }
        System.out.print(A);
    }
}