import java.util.*;
public class ReversePangram
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        
        String s1=s.nextLine();
        
        char[] A=s1.toCharArray();
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>='A' && A[i]<='Z')
            {
                System.out.print(A[i]);
            }
            else
            {
                int k=(int)A[i]-48;
                int j=i+1;
                while(j < A.length && A[j]>='0' && A[j]<='9')
                {
                    int y=(int)A[j]-48;
                    k=(k*10)+y;
                    j++;
                }
                
                for(int x=1;x<k;x++)
                {
                    System.out.print(A[i-1]);
                }
                i=j-1;
            }
            
        }
        
    }
}