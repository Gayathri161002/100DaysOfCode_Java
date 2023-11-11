import java.util.*;
import java.util.regex.*;
public class PasswordValidator 
{
    public static boolean isStrongPassword(String s)
    {
        if(s.length()<8)
        {
            return false;
        }
         
        Pattern up=Pattern.compile("[A-Z]");
        Matcher um=up.matcher(s);
        if(!(um.find()))
        {
            return false;
        }
        
        Pattern lp=Pattern.compile("[a-z]");
        Matcher lm=lp.matcher(s);
        if(!(lm.find()))
        {
            return false;
        }
        
        Pattern np=Pattern.compile("[0-9]");
        Matcher nm=np.matcher(s);
        if(!(nm.find()))
        {
            return false;
        }
        
        Pattern sp=Pattern.compile("[^a-zA-Z0-9]");
        Matcher sm=sp.matcher(s);
        if(!(sm.find()))
        {
            return false;
        }
        
        return true;
    }
    public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in); 
      String str=s.nextLine();
      
      if(isStrongPassword(str))
      {
          System.out.println("It is a strong Password.");
      }
      else
      {
           System.out.println("It is a weak Password.");
      }
    }
}