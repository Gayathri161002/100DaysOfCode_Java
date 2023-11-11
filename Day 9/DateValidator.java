import java.util.*;
import java.util.regex.*;
public class DateValidator {
    public static void main(String args[]) 
    {
      Scanner s=new Scanner(System.in); 
      String str=s.nextLine();
      
      Pattern p=Pattern.compile("^(0?[1-9]|[1-2][0-9]|3[0-1])-(0?[1-9]|1[0-2])-(1[0-9]{3}|[2-9][0-9]{3})$");
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