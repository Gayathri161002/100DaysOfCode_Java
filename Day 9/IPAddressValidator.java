import java.util.*;
import java.util.regex.*;
public class IPAddressValidator {
    public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in); 
      String str=s.nextLine();
      
      Pattern p=Pattern.compile("^((25[0-5]||2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.){3}(25[0-5]||2[0-4][0-9]|[0-1]?[0-9][0-9]?)$");
      Matcher m=p.matcher(str);
      
      if(m.find())
      {
          System.out.println("Valid");
      }
      else
      {
           System.out.println("Invalid");
      }
    }
}