import java.util.*;
import java.util.regex.*;
public class PhoneNumberValidation {
    public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in); 
      String str=s.nextLine();
      
      Pattern p=Pattern.compile("^(0||91)?[6-9][0-9]{9}$");
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


/* Input 1 :

919896543211

Output 1:

Valid 

Input 2 :

914896543211

Output :

Invalid */

