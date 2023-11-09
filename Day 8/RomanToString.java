import java.util.*;
public class RomanToString 
{
    public static int value(char ch)
    {
        switch (ch)
        {
            case 'I' :
                return 1;
            case 'V' :
                return 5;
            case 'X' :
                return 10;
            case 'L' :
                return 50;
            case 'C' :
                return 100;
            case 'D' :
                return 500;
            case 'M' :
                return 1000;
            default :     
                return -1;    
        }
    }
    
    public static int romanToInteger(String s)
    {
        int res=0;
        
        char[] A=s.toCharArray();
        
        for(int i=0;i<A.length;i++)
        {
            int s1=value(A[i]);
            
            if((i+1)<A.length)
            {
                int s2=value(A[i+1]);
                
                if(s1>=s2)
                {
                    res+=s1;
                }
                
                else
                {
                    res=res+s2-s1;
                    i++;
                }
            }
            
            else
            {
                res+=s1;
            }
        }
        
        return res;
    }

    public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      int result=romanToInteger(str);
      System.out.println(result);
      
    }
}