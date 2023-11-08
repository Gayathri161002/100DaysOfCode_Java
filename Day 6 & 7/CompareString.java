import java.util.*;
public class CompareString
{
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        StringBuffer s1=new StringBuffer("");
        s1.append(s.nextLine());
        
        StringBuffer s2=new StringBuffer("");
        s2.append(s.nextLine());
        
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='#')
            {
                s1.delete(i-1,i+1);
                i-=2;
            }
        }
        
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)=='#')
            {
                s2.delete(i-1,i+1);
                i-=2;
            }
        }
        
       System.out.println(s1.toString().equals(s2.toString()));
    }
}